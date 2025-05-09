/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author gbez
 */
public class FilaVetor<T> implements Fila<T> {

    private T info[];
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new RuntimeException("Fila está cheia");
        }
        int posicaoInserir;
        posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho = tamanho + 1;

    }

    @Override
    public boolean estavazia() {
        return (tamanho == 0);
    }

    @Override
    public T peek() {
        if (info.equals(estavazia())) {
            throw new RuntimeException("Fila está vazia");
        }
        return info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();
        inicio = (inicio + 1) % limite;
        tamanho = tamanho - 1;
        return valor;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        this.tamanho = 0;
        this.inicio = 0;
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);

        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % limite;
            f3.inserir((T) info[indice]);
        }
        for (int i = 0; i < f2.tamanho; i++) {
            int indice = (f2.inicio + i) % f2.limite;
            f2.inserir((T) f2.info[indice]);
        }
        return f3;
    }

    public String ToString() {
        String dados = "";
        if (estavazia()) {
            throw new RuntimeException("Fila vazia");
        }

        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % limite;
            dados += "[" + info[indice] + "]";
        }
        return dados;
    }

    public int getLimite() {
        return limite;
    }

}
