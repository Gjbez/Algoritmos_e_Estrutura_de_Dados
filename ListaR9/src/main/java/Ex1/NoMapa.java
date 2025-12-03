/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.util.Objects;

/**
 *
 * @author gbez
 */
public class NoMapa<K,T> {
    private K chave;
    private T valor;

    public NoMapa(K chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public boolean equals(Object chave) {
        if (this == chave) 
            return true;
        if (chave == null || getClass() != chave.getClass()) 
            return false;
        NoMapa<?,?> outro = (NoMapa<?,?>) chave;
        if (chave.equals(outro.getChave())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.chave);
        hash = 59 * hash + Objects.hashCode(this.valor);
        return hash;
    }
}


