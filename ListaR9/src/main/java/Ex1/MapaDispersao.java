/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class MapaDispersao<K,T> {
    private ListaEncadeada<NoMapa<K,T>>[] info;

    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(K chave) {
        return (Math.abs(chave.hashCode() % info.length));
    }

    public void inserir(K chave, T valor) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }
        NoMapa<K,T> noMapa = new NoMapa<>(chave, valor);
        noMapa.setChave(chave);
        noMapa.setValor(valor);
        info[indice].inserir(noMapa);
    }

    public void remover(K chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<K,T> noMapa = new NoMapa<>(chave, null);
            noMapa.setChave(chave);
            info[indice].retirar(noMapa);
        }
    }

    public T buscar(K chave) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            NoMapa<K,T> noMapa = new NoMapa<>(chave, null);
            noMapa.setChave(chave);

            NoLista<T> no = (NoLista<T>) info[indice].buscar(noMapa);
            if (no != null) {
                return ((NoMapa<K,T>) no.getInfo()).getValor();
            }
        }
        return null;
    }

    public double calcularFatorCarga() {
        int elementos = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i] != null) {
                elementos = elementos + info[i].obterComprimento();
            }
        }
        return (double) elementos / info.length;
    }
}