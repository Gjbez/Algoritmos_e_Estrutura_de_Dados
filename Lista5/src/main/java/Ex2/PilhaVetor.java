package Ex2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gbez
 */
public class PilhaVetor<T> implements Pilha<T> {
    
     private ListaEncadeada lista;

    @Override
    public void push(T info) {
        lista = new ListaEncadeada<T>();
    }

     @Override
    public T peek() {
        if (lista.estaVazia()) {
            throw new RuntimeException("Pilha está vazia");
        }
        return (T) lista.getPrimeiro().getInfo();
    }

     @Override
    public T pop() {
        T valor = peek();
        lista.retirar(valor);

        return valor;
    }

     @Override
    public String toString() {
        return lista.toString();
    }

    @Override
    public boolean estaVazia() {
        return (lista.getPrimeiro() == null);
    }

    @Override
    public void liberar() {
        while (lista.getPrimeiro() != null) {
            lista.retirar(lista);
        }
    }
}