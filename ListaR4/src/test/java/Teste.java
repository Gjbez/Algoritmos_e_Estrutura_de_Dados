/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.ListaDupla;
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
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.toString(), "20, 15, 10, 5");
    }
    
    @Test
    public void teste2() {
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.buscar(20).getInfo().toString(), "20");
    }
    
    @Test
    public void teste3() {
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.buscar(10).getInfo().toString(), "10");
    }
    
    @Test
    public void teste4() {
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.retirar(20);
        assertEquals(l.toString(), "15, 10, 5");   
    }
    
    @Test
    public void teste5() {
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.retirar(10);
        assertEquals(l.toString(), "20, 15, 5");   
    }
    
    @Test
    public void teste6() {
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.retirar(5);
        assertEquals(l.toString(), "20, 15, 10");   
    }
    
    @Test
    public void teste7() {
        ListaDupla<Integer> l = new ListaDupla<Integer>();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.liberar();
        assertEquals(l.toString(), "");   
    }
}
