/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class MapaDispersao<T> {

    private ListaEncadeada<NoMapa<T>> info[];

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    public int calcularHash(int chave) {
        int tamanho = info.length;
        return (chave % tamanho);
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }
        NoMapa<T> no = new NoMapa<>();
        no.setChave(chave);
        no.setInfo(dado);

        info[indice].inserir(no);
    }

    public void remove(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> no = new NoMapa<>();
            no.setChave(chave);
            info[indice].retirar(no);
        }
    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> nomapa = new NoMapa<>();
            nomapa.setChave(chave);

            NoLista<NoMapa<T>> no = info[indice].buscar(nomapa);
            if (no != null) {
                return no.getInfo().getInfo();
            }
        }
        return null;
    }

    public ListaEncadeada<NoMapa<T>>[] getInfo() {
        return info;
    }

}
