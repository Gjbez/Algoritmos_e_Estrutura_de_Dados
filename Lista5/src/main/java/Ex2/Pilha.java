package Ex2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbez
 */
public interface Pilha<T> {

    void push(T info);
    T pop();
    T peek();
    boolean estaVazia();
    void liberar();

    
}
