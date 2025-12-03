/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public abstract class OrdenacaoAbstract<T> {

    protected T info[];

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }

    public void trocar(T info[], int a, int b) {
        T temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }

    abstract void ordenar(T info[]);
}
