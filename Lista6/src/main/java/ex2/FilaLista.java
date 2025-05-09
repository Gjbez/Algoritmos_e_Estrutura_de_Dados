/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author gbez
 */
public class FilaLista<T> implements Fila<T>{
    
    private ListaEncadeada<T> lista;
    private T info[];
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaLista(int limite) {
       info = (T[]) new Object[limite];
       this.limite = limite;
       this.tamanho = 0;
       this.inicio = 0;
    }
    
    @Override
    public void inserir(T valor) {
        lista.inserirNoFinal(valor);
    }
    
    @Override
    public boolean estavazia(){
        return !(info == null);
    }
    
    @Override
    public T peek(){
        if(estavazia()){
         throw new RuntimeException("Fila está vazia");
        }
        return info[inicio];
    }
    
    @Override
    public T retirar(){
        T valor;
        valor = peek();
        lista.retirar(valor);
        return valor;
    }
    
    @Override
    public void liberar(){
        info = (T[]) new Object[limite];
       this.tamanho = 0;
       this.inicio = 0;
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
