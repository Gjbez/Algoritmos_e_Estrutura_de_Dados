/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author gbez
 */
public class NoArvoreBinaria {
    
    private int info;
    private NoArvoreBinaria esquerda;
    private NoArvoreBinaria direita;

    public NoArvoreBinaria(int info) {
        setInfo(info);
    }

    public NoArvoreBinaria(int info, NoArvoreBinaria esquerda, NoArvoreBinaria direita) {
        setInfo(info);
        setEsquerda(esquerda);
        setDireita(direita);
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }

    public NoArvoreBinaria getEsquerda() {
        return this.esquerda;
    }

    public NoArvoreBinaria getDireita() {
        return this.direita;
    }

    public void setEsquerda(NoArvoreBinaria esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoArvoreBinaria direita) {
        this.direita = direita;
    }
}

