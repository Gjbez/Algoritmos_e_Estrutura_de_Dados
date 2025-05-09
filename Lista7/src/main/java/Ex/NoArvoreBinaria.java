/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex;

/**
 *
 * @author gbez
 */
public class NoArvoreBinaria<T> {
    
    private T info;
    private NoArvoreBinaria<T> esq;
    private NoArvoreBinaria<T> dir;
    
    public NoArvoreBinaria(T info){
        this.info = (T) info;
        esq = null;
        dir = null;
    }
    
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir){
        this.info = (T) info;
        this.esq = esq;
        this.dir = dir;
    }

    public T getInfo() {
        return info;
    }
    
    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsq() {
        return esq;
    }

    public void setEsq(NoArvoreBinaria<T> esq) {
        this.esq = esq;
    }

    public NoArvoreBinaria<T> getDir() {
        return dir;
    }

    public void setDir(NoArvoreBinaria<T> dir) {
        this.dir = dir;
    }
}
