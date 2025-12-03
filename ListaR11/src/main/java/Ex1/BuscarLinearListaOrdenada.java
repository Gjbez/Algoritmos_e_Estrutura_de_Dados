/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class BuscarLinearListaOrdenada<T extends Comparable<T>> {

    public NoLista<T> buscar(ListaEncadeada<T> lista, T valor) {
    NoLista<T> atual = lista.getPrimeiro();
    while (atual != null) {
        T info = atual.getInfo();
        if (info.compareTo(valor) == 0) { 
            return atual;
        }
        if (info.compareTo(valor) > 0) {
            return null;
        }
        atual = atual.getProximo();
    }
    return null;
}
}