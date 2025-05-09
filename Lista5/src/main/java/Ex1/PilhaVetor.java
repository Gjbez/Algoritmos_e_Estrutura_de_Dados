package Ex1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gbez
 */
public class PilhaVetor<T> implements Pilha<T> {

    private Object info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        if (limite == tamanho) {
            throw new RuntimeException("Capacidade de pilha esgotada");
        }
        this.info[tamanho++] = info;
        //this.tamanho++;
    }

    @Override
    public T pop() {
        T valor = peek();
        info[tamanho] = null;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if (info.equals(estaVazia())) {
            throw new RuntimeException("Pilha está vazia");
        }
        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public String ToString() {
        String dados = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            dados += info[i];
            if (i != 0) {
                dados += ",";
            }
        }
        return dados;
    }

    public void concatenar(PilhaVetor<T> p) {
        PilhaVetor<T> pAux = new PilhaVetor<>(p.info.length);
        
        //while (!p.estaVazia()){
        //    pAux.push(p.pop());}
        
        for(int i = p.tamanho -1; i >= 0; i--){
          pAux.push((T)p.info[i]);
        }
        
        while (!pAux.estaVazia()){
            this.push(pAux.pop());
        }
    }
}
