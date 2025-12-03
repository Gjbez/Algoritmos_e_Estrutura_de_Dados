/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo e Guilherme 
 */
public class IndexadorPalavras {

    private MapaDispersao<String, ListaEncadeada<String>> indice;

    public IndexadorPalavras(int tamanho) {
        indice = new MapaDispersao<>(tamanho);
    }
    
    /**
     * Lê e indexa arquivos .txt 
     * @param diretorio
     * @throws IOException 
     */
    public void indexarDiretorio(File diretorio) throws IOException {
        if (diretorio == null || !diretorio.exists()) {
            System.out.println("Diretório inválido.");
            return;
        }
        if (diretorio.isDirectory()) {
            File[] arquivos = diretorio.listFiles();
            if (arquivos != null) {
                for (File f : arquivos) {
                    if (f.isDirectory()) {
                        indexarDiretorio(f);
                        // busca recursiva 
                    } else if (f.getName().toLowerCase().endsWith(".txt")) {
                        indexarArquivo(f);
                    }
                }
            }
        }
    }

    /**
     * Lê um arquivo e extrai palavras válidas 
     * @param arquivo
     * @throws IOException 
     */
    private void indexarArquivo(File arquivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = reader.readLine()) != null) {
            linha = linha.toLowerCase().replaceAll("[^a-zà-ú0-9\\s]", " ");
            String[] palavras = linha.split("\\s+");
            for (String p : palavras) {
                if (p.length() >= 3 && !p.matches("[0-9\\.]+")) {
                    adicionarPalavra(p, arquivo.getName());
                }
            }
        }
        reader.close();
    }

    /**
     * Adiciona palavra ao mapa (palavra -> lista de arquivos) 
     * @param palavra
     * @param nomeArquivo 
     */
    private void adicionarPalavra(String palavra, String nomeArquivo) {
        palavra = palavra.toLowerCase(); // <- Garante consistência
        ListaEncadeada<String> listaArquivos = indice.buscar(palavra);
        if (listaArquivos == null) {
            listaArquivos = new ListaEncadeada<>();
        }

        if (listaArquivos.buscar(nomeArquivo) == null) {
            listaArquivos.inserir(nomeArquivo);
        }

        indice.inserir(palavra, listaArquivos);
    }

    public List<String> buscarPalavrasLista(String... palavras) {
        List<String> resultados = new ArrayList<>();

        if (palavras.length == 0) {
            System.out.println("Informe pelo menos uma palavra.");
            return resultados;
        }

        ListaEncadeada<String> resultado = indice.buscar(palavras[0].toLowerCase());
        if (resultado == null) {
            System.out.println("Nenhum resultado encontrado para " + palavras[0]);
            return resultados;
        }

        for (int i = 1; i < palavras.length; i++) {
            ListaEncadeada<String> listaAtual = indice.buscar(palavras[i].toLowerCase());
            if (listaAtual == null) {
                resultado = new ListaEncadeada<>();
                break;
            }
            resultado = interseccionarListas(resultado, listaAtual);
        }

        NoLista<String> no = resultado.getPrimeiro();
        while (no != null) {
            resultados.add(no.getInfo());
            no = no.getProximo();
        }

        if (resultados.isEmpty()) {
            System.out.println("Nenhum documento contém todas as palavras.");
        } else {
            System.out.println("Total de arquivos encontrados: " + resultados.size());
        }

        return resultados;
    }
    
    /**
     * Interseção entre listas de arquivos 
     * @param a
     * @param b
     * @return 
     */
    private ListaEncadeada<String> interseccionarListas(ListaEncadeada<String> a, ListaEncadeada<String> b) {
        ListaEncadeada<String> intersec = new ListaEncadeada<>();
        NoLista<String> pa = a.getPrimeiro();
        while (pa != null) {
            if (b.buscar(pa.getInfo()) != null) {
                intersec.inserir(pa.getInfo());
            }
            pa = pa.getProximo();
        }
        return intersec;
    }

    public ListaEncadeada<String> buscarArquivos(String... palavras) {
        if (palavras.length == 0) {
            return null;
        }

        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = palavras[i].toLowerCase();
        }

        ListaEncadeada<String> resultado = indice.buscar(palavras[0]);
        System.out.println("Buscando palavra '" + palavras[0] + "', resultado: "
                + (resultado == null ? "null" : resultado.obterComprimento()));

        if (resultado == null) {
            return new ListaEncadeada<>();
        }

        for (int i = 1; i < palavras.length; i++) {
            ListaEncadeada<String> listaAtual = indice.buscar(palavras[i]);
            if (listaAtual == null) {
                return new ListaEncadeada<>();
            }
            resultado = interseccionarListas(resultado, listaAtual);
        }

        System.out.println("Total de arquivos encontrados: " + resultado.obterComprimento());
        return resultado;
    }

    /**
     * Salva o índice em arquivo 
     * @param caminhoArquivo
     * @throws IOException 
     */
    public void salvarIndice(String caminhoArquivo) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo));
        oos.writeObject(indice);
        oos.close();
    }
    
    /**
     * Carrega índice do disco 
     * @param caminhoArquivo
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @SuppressWarnings("unchecked")
    public void carregarIndice(String caminhoArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            Object obj = ois.readObject();
            if (obj instanceof MapaDispersao<?, ?> mapa) {
                indice = (MapaDispersao<String, ListaEncadeada<String>>) mapa;
                System.out.println("Índice carregado com sucesso. Fator de carga: " + indice.calcularFatorCarga());
            } else {
                throw new IOException("Arquivo de índice inválido.");
            }
        }
    }
}
