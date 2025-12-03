/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.ListaEncadeada;
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
public class Teste {

    @Test
    public void teste1() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        assertTrue(l.estaVazia());
    }

    @Test
    public void teste2() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        assertFalse(l.estaVazia());
    }

    @Test
    public void teste3() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        assertEquals(l.toString(), "5");
    }

    @Test
    public void teste4() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        assertEquals(l.toString(), "15,10,5");
    }
    
    @Test
    public void teste5() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.buscar(20).getInfo().toString(), "20");
    }
    
    @Test
    public void teste6() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.buscar(15).getInfo().toString(), "15");
    }
    
    @Test
    public void teste7() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(null, l.buscar(50));
    }
    
    @Test
    public void teste8() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.retirar(20);
        assertEquals(l.toString(), "15,10,5");
    }
    
    @Test
    public void teste9() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.retirar(15);
        assertEquals(l.toString(), "20,10,5");
    }
    
    @Test
    public void teste10() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.obterNo(0).getInfo().toString(), "20");
    }
    
    @Test
    public void teste11() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.obterNo(3).getInfo().toString(), "5");
    }
    
    @Test
    public void teste12() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertThrows(IndexOutOfBoundsException.class,()->{l.obterNo(10);});
    }
    
    @Test
    public void teste13() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        assertEquals(l.obterComprimento(), 0);
    }
    
    @Test
    public void teste14() {
        ListaEncadeada<Integer> l = new ListaEncadeada<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.obterComprimento(), 4);
    }
    
    
}
