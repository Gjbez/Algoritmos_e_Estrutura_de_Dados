/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public abstract class OrdenacaoAbstract{

    protected int info[];

    public int[] getInfo() {
        return info;
    }

    public void setInfo(int[] info) {
        this.info = info;
    }

    public void trocar(int info[], int a, int b) {
        int temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }

    abstract void ordenar(int info[]);
}
