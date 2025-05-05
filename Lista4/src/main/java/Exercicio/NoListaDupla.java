package Exercicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class NoListaDupla<T> {
    
    private T info;
    private NoListaDupla<T> proximo;
    private NoListaDupla<T> anterior;

    public NoListaDupla<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoListaDupla<T> anterior) {
        this.anterior = anterior;
    }

    public NoListaDupla<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoListaDupla<T> Proximo) {
        this.proximo = Proximo;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    
}
