/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;
/**
 *
 * @author gbez
 */
public abstract class ListaAbstract<T> {

    protected Object[] info;
    protected int tamanho;

    public ListaAbstract() {
        info = new Object[10];
        tamanho = 0;
    }

    protected Object[] getInfo() {
        return info;
    }

    protected void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    protected void redimensionar() {
        Object[] novo = new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public abstract void inserir(T valor);

    public abstract int buscar(T valor);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);
            if (i < tamanho - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
