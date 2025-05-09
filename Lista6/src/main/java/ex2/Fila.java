/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author gbez
 */
public interface Fila<T> {
    
    void inserir(T valor);
    boolean estavazia();
    T peek();
    T retirar();
    void liberar();
}
