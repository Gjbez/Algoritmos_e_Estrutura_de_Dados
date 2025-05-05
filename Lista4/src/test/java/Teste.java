/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Exercicio.ListaDupla;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbez
 */
public class Teste {

    @Test
    public void teste1() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20, 15, 10, 5", lista.toString());
        assertEquals("5, 10, 15, 20", lista.exibirOrdemInvertida());
    }
    
    @Test
    public void teste2() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20", lista.buscar(20).getInfo().toString());
    }
    
    @Test
    public void teste3() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("10", lista.buscar(10).getInfo().toString());
    }
    
    @Test
    public void teste4() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15, 10, 5", lista.toString());
        assertEquals("5, 10, 15", lista.exibirOrdemInvertida());
    }
    
    @Test
    public void teste5() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        assertEquals("20, 15, 5", lista.toString());
        assertEquals("5, 15, 20", lista.exibirOrdemInvertida());
    }
    
    @Test
    public void teste6() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(5);
        assertEquals("20, 15, 10", lista.toString());
        assertEquals("10, 15, 20", lista.exibirOrdemInvertida());
    }
    
    @Test
    public void teste7() {
        ListaDupla<Integer> lista = new ListaDupla<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.liberar();
        assertEquals("", lista.toString());
    }
}
