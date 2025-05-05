package Exercicio;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gbez
 */
public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        liberar();
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<T>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            this.primeiro.setAnterior(novo);
        }
        this.primeiro = novo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p.getInfo() == valor) {
                return p;
            }
            p = p.getProximo();

        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
        if (p != null) {
            if (primeiro == p) {
                this.primeiro = p.getProximo();
            }
            p.getAnterior().setProximo(p.getProximo());
        }
        if (p.getProximo() != null) {
            p.getProximo().setAnterior(p.getAnterior());
        }
    }

    public void listacircular() {
        NoListaDupla<T> p = primeiro;
        if (p != null) {
            JOptionPane.showInputDialog(p.getInfo());
            p = p.getProximo();
        }
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
    
    public ListaDupla<T> clonar() {
        ListaDupla<T> clone = new ListaDupla<T>();
        NoListaDupla<T> p = primeiro;
        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        while (p != null) {
            clone.inserir(p.getInfo());
            p = p.getAnterior();
        }   
        return clone;
    }

}
