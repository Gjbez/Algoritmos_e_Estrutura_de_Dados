/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author Guilherme e Gustavo
 */
/**
 * Classe que representa uma lista de tags HTML válidas.
 */
public class ListaTags {

    private class TagContada {

        String nome;
        int contador;
        TagContada proximo;

        TagContada(String nome) {
            this.nome = nome.toLowerCase();
            this.contador = 1;
        }
    }

    private TagContada inicio;

    public void adicionarOuIncrementar(String nome) {
        nome = nome.toLowerCase();
        TagContada atual = inicio;
        TagContada anterior = null;

        while (atual != null && atual.nome.compareTo(nome) < 0) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual != null && atual.nome.equals(nome)) {
            atual.contador++;
        } else {
            TagContada nova = new TagContada(nome);
            if (anterior == null) {
                nova.proximo = inicio;
                inicio = nova;
            } else {
                nova.proximo = anterior.proximo;
                anterior.proximo = nova;
            }
        }
    }

    public void exibirTags() {
        System.out.println("Tags encontradas:");
        TagContada atual = inicio;
        while (atual != null) {
            System.out.println(atual.nome + ": " + atual.contador);
            atual = atual.proximo;
        }
    }
}
