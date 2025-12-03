/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author gbez
 */
public abstract class ArvoreBinariaAbtract {
 
    protected NoArvoreBinaria raiz;

    public ArvoreBinariaAbtract() {
        setRaiz(raiz);
    }

    protected void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria getRaiz() {
        return this.raiz;
    }

    public boolean estaVazia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pertence(int info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, int info) {
        if (no == null) {
            return false;
        } else {
            return (no.getInfo() == info || pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info));
        }
    }

    public abstract NoArvoreBinaria buscar(int info);

    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria no) {
        if (no == null) {
            return "<>";
        }
        String esquerdaStr = arvorePre(no.getEsquerda());
        String direitaStr = arvorePre(no.getDireita());
        return "<" + no.getInfo() + esquerdaStr + direitaStr + ">";
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }
}

