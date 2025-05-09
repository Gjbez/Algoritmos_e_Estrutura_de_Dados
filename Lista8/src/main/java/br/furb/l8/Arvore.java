package br.furb.l8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return obterRepresentacaoTextual(raiz);
        }
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        String s = "<";
        s = s + no.getInfo();

        NoArvore<T> p;
        p = no.getPrim();
        while (p != null) {
            s = s + obterRepresentacaoTextual(p);
            p = p.getProx();
        }
        s = s + ">";
        return s;
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        }
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo() == info) {
            return true;
        }
        NoArvore<T> p;
        p = no.getPrim();
        while (p != null) {
            if (pertence(p, info)) {
                return true;
            }
            p = p.getProx();
        }
        return false;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvore<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getPrim()) + contarNos(no.getProx());
        }
    }

    //desafio
    public String ToStringRaiz(T info) {
        NoArvore<T> raiznova = buscar(raiz, info);
        if (raiznova == null) {
            return "<>";
        }
        return obterRepresentacaoTextual(raiznova);
    }

    public NoArvore<T> buscar(T info) {
        return buscar(raiz, info);
    }

    private NoArvore<T> buscar(NoArvore<T> no, T info) {
        if (no == null) {
            return null;
        }
        if (no.getInfo().equals(info)) {
            return no;
        }
        NoArvore<T> conteudo;
        conteudo = buscar(no.getPrim(), info);
        if (conteudo != null) {
            return conteudo;
        }
        return buscar(no.getProx(), info);
    }
    
}
