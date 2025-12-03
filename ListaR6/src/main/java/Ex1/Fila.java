/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public interface Fila<T> {
    
    void inserir(T valor);
    T retirar();
    T peek();
    boolean estavazia();
    void liberar();
}
