/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra;

/**
 *
 * @author gbez
 */
public class BuscaLinearListaOrdenada<T extends Comparable<T>> {

    public NoLista<T> buscar(ListaEncadeada<T> lista, T valor) {
        NoLista<T> atual = lista.getPrimeiro();

        while (atual != null) {
            T info = atual.getInfo();

            // Se encontrou o valor, retorna o nó
            if (info.compareTo(valor) == 0) {
                return atual;
            }

            // Se passou do valor (lista está ordenada), pode parar
            if (info.compareTo(valor) > 0) {
                return null;
            }

            // Avança para o próximo nó
            atual = atual.getProximo();
        }

        // Não encontrou
        return null;
    }
}
