package com.example;

import javax.swing.JOptionPane;

public class Exercicio2<T> {

    private T[] info;
    private int tamanho;

    public void ListaEstatica(){
    liberar();
    }

    private void redimensionar(){

        T[] novo;
        int novotamanho;

        novotamanho = info.length + 10;
        novo = (T[]) new Object[novotamanho];
        for (int i = 0; i < tamanho -1; i++){
            novo[i] = info[i];
        }
        novo = info;
    }

    public void inserir(T valor){
        if (tamanho == info.length){
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){
        System.out.println(toString());
    }

    public int buscar(T valor){

        for (int i = 0; i< tamanho -1; i++){
            if (info[i] == valor){
            return i;
            }
        }
        return -1;
    } 

    public void retirar(T valor){
        int indice = buscar(valor);

        if (indice != -1){
        for (int i = indice; i < tamanho - 1; i++){
            info[i] = info[i + 1];
         }
         tamanho--;
       }
    }

    public void liberar(){
     info = (T[]) new Object[10];
     tamanho = 0;
    }

    public T obterElemento(int posicao){
        if (posicao < tamanho){
            return (T) info[posicao];
        }
        throw new IndexOutOfBoundsException(); 
    }

    public boolean estaVazia(){
      return !(tamanho == 0);
    }

    public int getTamanho(){
        return this.tamanho;
      }

    public String toString(){
        String numero = "";

        for (int i = 0; i < tamanho - 1; i++){
            numero += info[i].toString() + "\n";
        }
        return numero;
    }

    public void inverter () {

        for(int i = 0; i < tamanho / 2; i++){
            T n = (T)info[i];
            info[i] = info[tamanho-1-i];
            info[tamanho-1-i] = n; 
        }
       /* T temp;
        for (int i = 0; i < tamanho; i++) {
          for (int x = 0; x < i; x++) {
            temp = info[i];
            info[i] = info[x];
            info[x] = temp; 
          }
        }*/
      }

    public static void main(String[] args) {
        new Exercicio2<>();
    }
    
}
