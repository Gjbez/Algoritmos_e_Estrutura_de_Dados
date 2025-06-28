/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author Guilherme e Gustavo
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe que valida se uma sequência de tags HTML está bem formada.
 */
public class ValidadorHTML {

    private final String[] singletonTags = {
        "meta", "base", "br", "col", "command", "embed", "hr",
        "img", "input", "link", "param", "source", "!doctype"
    };

    private PilhaTags pilha;
    private ListaTags contador;

    public ValidadorHTML() {
        pilha = new PilhaTags();
        contador = new ListaTags();
    }

    public void processarArquivo(String nomeArquivo) {
        boolean erro = false;
        int linhaAtual = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                linhaAtual++;
                linha = linha.trim();
                if (linha.isEmpty()) {
                    continue;
                }

                int pos = 0;
                while (pos < linha.length()) {
                    int ini = linha.indexOf('<', pos);
                    int fim = linha.indexOf('>', ini);
                    if (ini == -1 || fim == -1) {
                        break;
                    }

                    String tagBruta = linha.substring(ini + 1, fim).trim();
                    String[] partes = tagBruta.split("\\s+");
                    if (partes.length == 0) {
                        break;
                    }

                    String nomeTag = partes[0].toLowerCase();
                    boolean ehFechamento = false;

                    if (nomeTag.startsWith("/")) {
                        ehFechamento = true;
                        nomeTag = nomeTag.substring(1);
                    }

                    if (!ehFechamento && !isSingleton(nomeTag)) {
                        pilha.empilhar(nomeTag);
                        contador.adicionarOuIncrementar(nomeTag);
                    } else if (!ehFechamento && isSingleton(nomeTag)) {
                        contador.adicionarOuIncrementar(nomeTag);
                    } else {
                        String esperada = pilha.desempilhar();
                        if (esperada == null || !esperada.equalsIgnoreCase(nomeTag)) {
                            System.out.println("Erro na linha " + linhaAtual + ": esperava </" + (esperada != null ? esperada : "?") + "> mas encontrou </" + nomeTag + ">");
                            erro = true;
                            break;
                        }
                    }

                    pos = fim + 1;
                }

                if (erro) {
                    break;
                }
            }

            if (!erro) {
                if (!pilha.estaVazia()) {
                    System.out.println("Erro: Faltam tags de fechamento:");
                    while (!pilha.estaVazia()) {
                        System.out.println("Esperava </" + pilha.desempilhar() + ">");
                    }
                } else {
                    System.out.println("Arquivo bem formatado.");
                    contador.exibirTags();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private boolean isSingleton(String tag) {
        for (int i = 0; i < singletonTags.length; i++) {
            if (singletonTags[i].equalsIgnoreCase(tag)) {
                return true;
            }
        }
        return false;
    }
}
