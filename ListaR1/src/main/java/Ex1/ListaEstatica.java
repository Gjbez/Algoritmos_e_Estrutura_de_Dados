/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class ListaEstatica {

    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    public void redimensionar() {
        int[] novo;
        int novoTamanho = info.length + 10;
        novo = new int[novoTamanho];
        for (int i = 0; i < tamanho - 1; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public int buscar(int valor) {
        for (int i = 0; i < tamanho - 1; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int indiceValor = buscar(valor);
        if (indiceValor != -1) {
            for (int i = indiceValor; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public int Obterelemento(int posicao) {
        if (posicao < tamanho) {
            return info[posicao];
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean estavazia() {
        return !(tamanho == 0);
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public String toString() {
        String numeros = "";
        for (int i = 0; i < tamanho; i++) {
            numeros += info[i];
            if (i < tamanho - 1) {
                numeros += ",";
            }
        }
        return numeros;
    }

    public void exibir() {
        for (int i = 0; i < tamanho - 1; i++) {
            System.out.println(info[i]);
        }
    }

    public int getTamanho() {
        return tamanho;
    }

}
