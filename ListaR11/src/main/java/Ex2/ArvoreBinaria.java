/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author gbez
 */
public class ArvoreBinaria extends ArvoreBinariaAbtract{

    @Override
    public NoArvoreBinaria buscar(int info) {
        NoArvoreBinaria p = raiz;
        while (p != null && p.getInfo() != info) {
            if (info < p.getInfo()) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        return p;
    }

    private NoArvoreBinaria buscar(NoArvoreBinaria no, int info) {
        if (no == null) {
            return null;
        }    

        if (info == no.getInfo()) {
            return no;
        } else {
            if (info < no.getInfo()) {
                return buscar(no.getEsquerda(), info);
            } else {
                return buscar(no.getDireita(), info);
            }
        }
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }
}
