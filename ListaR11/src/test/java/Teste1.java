/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import Ex1.BuscarLinearListaOrdenada;
import Ex1.ListaEncadeada;
import Ex1.NoLista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbez
 */
public class Teste1 {
    
   public static void main(String[] args) {
        // Cria a lista encadeada ordenada
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(30);
        lista.inserir(20);
        lista.inserir(10); // Lista: 10 -> 20 -> 30

        // Instancia o buscador
        BuscarLinearListaOrdenada<Integer> busca = new BuscarLinearListaOrdenada<>();

        // Testa valor existente
        NoLista<Integer> achado = busca.buscar(lista, 20);
        System.out.println("\n");
        System.out.println(achado != null ? achado.getInfo() : "Não encontrado"); // Esperado: 20

        // Testa valor inexistente
        NoLista<Integer> naoAchado = busca.buscar(lista, 25);
        System.out.println(naoAchado != null ? naoAchado.getInfo() : "Não encontrado"); // Esperado: Não encontrado
    }
}
