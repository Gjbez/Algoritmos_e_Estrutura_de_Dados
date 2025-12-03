/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author gbez
 */
public class FilaLista<T> implements Fila<T>{
    
    private ListaEncadeada<T> lista;
    
    public FilaLista(){
        lista = new ListaEncadeada<>();
    }

    @Override
    public void inserir(T valor) {
        lista.inserirNoFinal(valor);        
    }

    @Override
    public boolean estavazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        if (lista.estaVazia()) {
            throw new RuntimeException("Fila esta vazia");
        }
        return (T) lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        T valor = peek();
        lista.retirar(valor);
        return valor;
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<>();
    }
 
    public String toString() {
        return lista.toString();
    }
}
