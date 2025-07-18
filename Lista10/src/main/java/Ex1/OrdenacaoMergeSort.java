/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class OrdenacaoMergeSort extends OrdenacaoAbstract {

    @Override
    public void ordenar(int[] info) {
        int n = (info.length)-1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio+fim)/2; 
            mergeSort(inicio, meio);
            mergeSort(meio+1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int meio, int fim) {
        int tamEsquerda = (meio - inicio)+1;
        int[] esquerda = new int[tamEsquerda];
        for (int i = 0; i < tamEsquerda-1; i++) {
            esquerda[i] = (int) info[inicio+i];
        }

        int tamDireita = fim - meio;
        int[] direita = new int[tamDireita];
        for (int i = 0; i < tamDireita-1; i++) {
            direita[i] = (int) info[meio+1+i];
        }

        int cEsq = 0;
        int cDir = 0;
        
        for (int i = inicio; i < fim; i++) {
            if ((cEsq < tamEsquerda) && (cDir < tamDireita)) {
                if (esquerda[cEsq] < direita[cDir]) {
                    info[i] = esquerda[cEsq];
                    cEsq = cEsq + 1;
                } else {
                info[i] = direita[cDir];
                    cDir = cDir + 1;
                }
            } else {
                break;
            }

            while (cEsq < tamEsquerda) {
                info[i] = esquerda[cEsq];
                cEsq = cEsq +1;
                i = i + 1;
            }
            while (cDir < tamDireita) {
                info[i] = direita[cDir];
                cDir = cDir + 1;
                i = i + 1;
            }
        }
    }
}
