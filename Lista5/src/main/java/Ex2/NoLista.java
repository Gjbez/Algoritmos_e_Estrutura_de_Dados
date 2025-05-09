/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author gbez
 */
public class NoLista<T> {
    
    private T info;
    private NoLista<T> proximo;

    public NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoLista<T> Proximo) {
        this.proximo = Proximo;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    
}