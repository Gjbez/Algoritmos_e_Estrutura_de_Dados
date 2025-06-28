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
 * Classe que representa uma pilha de tags HTML para controle de abertura e
 * fechamento de tags.
 */
public class PilhaTags {

    private class NoTag {

        String nome;
        NoTag proximo;

        NoTag(String nome) {
            this.nome = nome.toLowerCase();
        }
    }

    private NoTag topo;

    /**
     * Adiciona uma tag ao topo da pilha.
     *
     * @param a tag a ser adicionada.
     */
    public void empilhar(String nome) {
        NoTag novo = new NoTag(nome);
        novo.proximo = topo;
        topo = novo;
    }

    /**
     * Remove e retorna a tag do topo da pilha.
     *
     * @return a tag removida do topo.
     */
    public String desempilhar() {
        if (topo == null) {
            return null;
        }
        String nome = topo.nome;
        topo = topo.proximo;
        return nome;
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se estiver vazia, false caso contrário.
     */
    public boolean estaVazia() {
        return topo == null;
    }
}
