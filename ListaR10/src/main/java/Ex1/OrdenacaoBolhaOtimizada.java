/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class OrdenacaoBolhaOtimizada<T extends Comparable<T>> extends OrdenacaoAbstract<T>{

    @Override
    public void ordenar(T[] info) {
        int i, j;
        int n = info.length;
        boolean trocou;
        for (i = 0; i < n-1; i++) {
            trocou = false;
            for (j = 0; j < i-1; j++) {
                if (((Comparable<T>) info[i]).compareTo(info[j+1]) > 0) {
                    trocar(info, j, j+1);
                    trocou = true;
                }
            }
            if (!trocou) {
                return;
            }
        }
    }
}
