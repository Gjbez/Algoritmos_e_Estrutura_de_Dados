/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

import java.io.Serializable;

/**
 *
 * @author Gustavo e Guilherme
 */
public class NoLista<T> implements Serializable {

    private T info;
    private NoLista<T> proximo;
    private static final long serialVersionUID = 1L;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }
}
