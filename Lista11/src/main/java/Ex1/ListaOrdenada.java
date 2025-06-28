/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class ListaOrdenada<T extends Comparable<T>> extends ListaAbstract<T> {

    @Override
    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }

        int pos = 0;
        while (pos < tamanho && valor.compareTo((T) info[pos]) > 0) {
            pos++;
        }

        for (int i = tamanho; i > pos; i--) {
            info[i] = info[i - 1];
        }

        info[pos] = valor;
        tamanho++;
    }

    @Override
    public int buscar(T valor) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comp = valor.compareTo((T) info[meio]);

            if (comp == 0) {
                return meio;
            } else if (comp < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}
