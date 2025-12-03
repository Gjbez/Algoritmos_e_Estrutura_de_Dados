/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

import java.io.Serializable;

/**
 *
 * @author Gustavo e Guilherme
 */
public class MapaDispersao<K, T> implements Serializable {

    private ListaEncadeada<NoMapa<K, T>>[] info;
    private static final long serialVersionUID = 1L;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(K chave) {
        if (chave instanceof String texto) {
            return gerarHashFixo(texto) % info.length;
        }
        return (Math.abs(chave.hashCode() % info.length));
    }

    private int gerarHashFixo(String texto) {
        long h = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            h = (h * 31 + c) % Integer.MAX_VALUE; // 31 é base padrão do hash de String
        }
        return (int) h;
    }

    public void inserir(K chave, T valor) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        // procura nó existente com a mesma chave
        NoMapa<K, T> chaveProcurada = new NoMapa<>(chave, null);
        NoLista<NoMapa<K, T>> noExistente = info[indice].buscar(chaveProcurada);

        if (noExistente != null) {
            // Atualiza o valor do nó existente
            noExistente.getInfo().setValor(valor);
        } else {
            // Insere novo par
            info[indice].inserir(new NoMapa<>(chave, valor));
        }
    }

    public void remover(K chave) {
        int indice = calcularHash(chave);
        if (info[indice] != null) {
            NoMapa<K, T> noMapa = new NoMapa<>(chave, null);
            noMapa.setChave(chave);
            info[indice].retirar(noMapa);
        }
    }

    public T buscar(K chave) {
        int indice = calcularHash(chave);
        if (info[indice] == null) {
            return null;
        }

        NoMapa<K, T> procurado = new NoMapa<>(chave, null);
        NoLista<NoMapa<K, T>> no = info[indice].buscar(procurado);
        if (no != null) {
            return no.getInfo().getValor();
        }
        return null;
    }

    public double calcularFatorCarga() {
        int elementos = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] != null) {
                elementos = elementos + info[i].obterComprimento();
            }
        }
        return (double) elementos / info.length;
    }

    public long gerarCodigo(String texto) {
        int n = texto.length() - 1;
        long h = 0;
        for (int c = n; c >= 0; c--) {
            char caractere = texto.charAt(c);
            int codigo = mapear(caractere);
            int expoente = n - c;
            h = h + (codigo * (long) Math.pow(26, expoente));
        }
        return h;
    }

    public int calcularHash(String texto) {
        int n = texto.length() - 1;
        long h = 0;
        for (int c = 0; c <= n; c++) {
            char caractere = texto.charAt(c);
            int codigo = mapear(caractere);
            int expoente = n - c;
            h = (h + (codigo * (long) Math.pow(26, expoente))) % Integer.MAX_VALUE;
        }
        return (int) h;
    }

    public int mapear(char caractere) {
        caractere = Character.toLowerCase(caractere);
        if (caractere >= 'a' && caractere <= 'z') {
            return caractere - 'a' + 1;
        }
        return 0;
    }
}
