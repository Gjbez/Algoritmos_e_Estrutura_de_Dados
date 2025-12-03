/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;


/**
 *
 * @author gbez
 */
public class PilhaVetor<T> implements Pilha<T> {

    private ListaEncadeada<T> l;
    
     public PilhaVetor(){
          l = new ListaEncadeada<T>();
    }

    @Override
    public void push(T info) {
        l.inserir(info);
    }

    @Override
    public T pop() {
        T valor = peek();
        l.retirar(valor);
        return valor;
    }

    @Override
    public T peek() {
        if (l.estaVazia()) {
        }
        return l.getPrimeiro().getInfo();
    }

    @Override
    public boolean estavazia() {
        return (l.getPrimeiro() == null);
    }

    @Override
    public void liberar() {
        while (l.getPrimeiro() != null) {
            l.retirar((T) l);
        }
    }

    public String ToString() {
        return l.toString();
    }
}
