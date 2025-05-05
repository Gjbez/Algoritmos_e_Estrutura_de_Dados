/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testes;

import Exercicio.ListaEncadeada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbez
 */
public class TesteLista3 {
    
    @Test
    public void teste01() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        assertTrue(lista.estaVazia());
    }
    
    @Test
    public void teste02() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        assertFalse(lista.estaVazia());
    }
    
    @Test
    public void teste03() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        assertEquals("5", lista.buscar(5).getInfo().toString());
    }
    
    @Test
    public void teste04() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        assertEquals("15, 10, 5", lista.toString());
        assertEquals(3, lista.obterComprimento());
    }
    
    @Test
    public void teste05() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20", lista.buscar(20).getInfo().toString());
    }
    
    @Test
    public void teste06() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("15", lista.buscar(15).getInfo().toString());
    }
    
    @Test
    public void teste07() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(null, lista.buscar(50));
    }
    
    @Test
    public void teste08() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15, 10, 5",lista.toString());
    }
    
    @Test
    public void teste09() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        assertEquals("20, 10, 5",lista.toString());
    }
    
    @Test
    public void teste10() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("20", lista.obterNo(0).getInfo().toString());
    }
    
    @Test
    public void teste11() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("5", lista.obterNo(3).getInfo().toString());
    }
    
    @Test
    public void teste12() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertThrows(IndexOutOfBoundsException.class,()->{lista.obterNo(10);});
    }
    
    @Test
    public void teste13() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        assertEquals(0, lista.obterComprimento());
    }
    
    @Test
    public void teste14() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.obterComprimento());
    }
}
