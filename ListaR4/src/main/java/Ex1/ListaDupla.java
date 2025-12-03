/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public void inserir(T info) {
        NoListaDupla<T> novo = new NoListaDupla<T>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            this.primeiro.setAnterior(novo);
        }
        this.primeiro = novo;
    }

    public NoListaDupla<T> buscar(T info) {
        NoListaDupla<T> p = (NoListaDupla<T>) primeiro;
        while (p != null) {
            if (p.getInfo().equals(info)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }
            if (p.getProximo() != null) {
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    public void liberar() {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            NoListaDupla<T> temp = p;
            p = p.getProximo();
            temp.setAnterior(null);
            temp.setProximo(null);
        }
        primeiro = null;
    }

    public String exibirOrdemInvertida() {
        String ordem = "";
        NoListaDupla<T> p = getUltimo();
        while (p != null) {
            ordem += p.getInfo();
            if (p.getAnterior() != null) {
                ordem += ", ";
            }
            p = p.getAnterior();
        }
        return ordem;
    }

    public NoListaDupla<T> getUltimo() {
        NoListaDupla<T> p = primeiro;
        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        return p;
    }

    public String toString() {
        String numero = "";
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            numero += p.getInfo();
            if (p.getProximo() != null) {
                numero += (", ");
            }
            p = p.getProximo();
        }
        return numero;
    }

}
