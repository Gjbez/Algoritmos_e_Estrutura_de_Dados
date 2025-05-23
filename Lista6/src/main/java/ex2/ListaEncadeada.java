/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author gbez
 */
public class ListaEncadeada<T> {

    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista<T>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info) {
        NoLista<T> p = (NoLista<T>) primeiro;
        while (p != null) {
            if (p.getInfo() == info) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoLista<T> anterior = null;
        NoLista<T> p = (NoLista<T>) primeiro;
        while (p != null && p.getInfo().equals(info)) {
            anterior = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p != primeiro) {
                primeiro = p.getProximo();
            }
            anterior.setProximo(p.getProximo());
        }

    }

    public int obterComprimento() {
        int comprimento = 0;
        NoLista<T> p = (NoLista<T>) primeiro;
        while (p != null) {
            comprimento++;
            p = p.getProximo();
        }
        return comprimento;
    }

    public NoLista<T> obterNo(int idx) {
        if (idx < 0 || idx >= obterComprimento()) {
            throw new IndexOutOfBoundsException("fora do limite: " + idx);
        }
        int indice = 0;
        NoLista<T> p = primeiro;
        while (p != null) {
            if (indice == idx) {
                return p;
            }
            indice++;
            p = p.getProximo();
        }
        return null;
    }

    public String toString() {
        String numero = "";
        NoLista<T> p = (NoLista<T>) primeiro;
        while (p != null) {
            numero += p.getInfo();
            if (p.getProximo() != null) {
                numero += (", ");
            }
            p = p.getProximo();
        }
        return numero;
    }
    
    public void inserirNoFinal(T valor){
    
        NoLista<T> novo = new NoLista<T>();
        novo.setInfo(valor);
        novo.setProximo(null);
        
        if (estaVazia()) {
            primeiro = novo;
        }
        else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
}
