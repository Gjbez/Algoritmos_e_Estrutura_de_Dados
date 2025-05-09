/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex;

/**
 *
 * @author gbez
 */
public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estavazia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }
        return (no.getInfo() == info || pertence(no.getEsq(), info) || pertence(no.getDir(), info));
    }

    @Override
    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        String esquerdaStr = arvorePre(no.getEsq());
        String direitaStr = arvorePre(no.getDir());
        return "<" + no.getInfo() + esquerdaStr + direitaStr + ">";
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getEsq()) + contarNos(no.getDir());
        }
    }

    //desafio
    
    public String ToStringRaiz(T info) {
        NoArvoreBinaria<T> raiznova = buscar(raiz, info);
        if (raiznova == null) {
            return "<>";
        }
        return arvorePre(raiznova);
    }

    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(raiz, info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        if (no.getInfo().equals(info)) {
            return no;
        }
        NoArvoreBinaria<T> conteudo;
        conteudo = buscar(no.getEsq(), info);
        if (conteudo != null) {
            return conteudo;
        }
        return buscar(no.getDir(), info);
    }

//Clonar
    
    public ArvoreBinaria<T> clonar(){
        ArvoreBinaria<T> clone = new ArvoreBinaria<T>();
        clone.setRaiz(clonar(this.raiz));
        return clone;
    }
    
    private NoArvoreBinaria<T> clonar(NoArvoreBinaria<T> no){
        if(no == null) {
            return null;
        }
        NoArvoreBinaria<T> cloneNo = new NoArvoreBinaria<T>(no.getInfo());
        cloneNo.setEsq(clonar(no.getEsq()));
        cloneNo.setDir(clonar(no.getDir()));
        return cloneNo;
    }
}
