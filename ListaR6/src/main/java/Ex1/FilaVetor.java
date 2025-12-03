/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class FilaVetor<T> implements Fila<T>{
    
    private T[] info;
    private int tamanho;
    private int limite;
    private int inicio;
    
    public FilaVetor(int limite){
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if(tamanho == limite){
            throw new RuntimeException("Fila está cheia");
        }
        int posicaoinserir;
        posicaoinserir = (inicio + tamanho)%limite;
        info[posicaoinserir] = valor;
        tamanho++;
    }

    @Override
    public T retirar() {
        T valor = peek();
        info[inicio] = null;
        inicio = (inicio + 1)%limite;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if(tamanho == 0){
            throw new RuntimeException("Fila está vazia");
        }
        return info[inicio];
    }

    @Override
    public boolean estavazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }
    
    public FilaVetor<T> concatenar(FilaVetor<T> f2) { 
        FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite); 
        
        int posicao = this.inicio;
        for (int i = 0; i < tamanho; i++) { 
            f3.inserir((T) this.info[posicao]);
            posicao = (posicao + 1) % this.limite; 
        }
        posicao = f2.inicio;
        for (int i = 0; i < f2.tamanho; i++) { 
            f3.inserir((T) f2.info[posicao]);
            posicao = (posicao + 1) % f2.limite; 
        }
        return f3; 
    }

    public String toString() { 
        String retorno = ""; 
        int posicao = inicio;
        for (int i = 0; i < tamanho; i++) {
            if(i > 0){
                retorno += ",";
            }
            retorno = retorno + info[posicao];
            posicao = (posicao + 1) % limite;
        }
        return retorno;
    }

    public int getLimite() { 
        return limite;
    }
}
