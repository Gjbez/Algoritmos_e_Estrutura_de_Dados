/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class PilhaVetor<T> implements Pilha<T> {

    private Object[] info;
    private int tamanho;
    private int limite;

    public PilhaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.tamanho = 0;
        this.limite = limite;
    }

    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new RuntimeException("Capacidade de pilha esgotada");
        }
        this.info[tamanho++] = info;
    }

    @Override
    public T pop() {
        T valor = peek();
        info[tamanho] = null;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if(tamanho == 0) {
            throw new RuntimeException("Pilha esta vazia");
        }
        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estavazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        this.tamanho = 0;
        this.limite = limite;
    }

    public String toString() {
        String s = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            s += info[i];
            if (i != 0) {
                s += ",";
            }
        }
        return s;
    }
    
    public void concatenar(PilhaVetor<T> p2) {
        for (int i = 0; i < p2.tamanho ; i++) {
            push((T)p2.info[i]);
        }
    }

}
