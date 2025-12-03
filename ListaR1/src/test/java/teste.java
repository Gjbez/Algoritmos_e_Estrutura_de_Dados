/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.ListaEstatica;
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
public class teste {
    
    @Test
    public void teste1(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.toString(), "5,10,15,20");
    }
    
    @Test
    public void teste2(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(l.getTamanho(), 4);
    }
    
    @Test
    public void teste3(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(2,l.buscar(15));
    }
    
    @Test
    public void teste4(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(-1,l.buscar(30));
    }
    
    @Test
    public void teste5(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        l.retirar(10);
        assertEquals(l.toString(), "5,15,20");
        assertEquals(l.getTamanho(), 3);
    }
    
    @Test
    public void teste6(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(1);
        l.inserir(2);
        l.inserir(3);
        l.inserir(4);
        l.inserir(5);
        l.inserir(6);
        l.inserir(7);
        l.inserir(8);
        l.inserir(9);
        l.inserir(10);
        l.inserir(11);
        l.inserir(12);
        l.inserir(13);
        l.inserir(14);
        l.inserir(15);
        assertEquals(l.toString(), "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
        assertEquals(l.getTamanho(), 15);
    }
    
    @Test
    public void teste7(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertEquals(20,l.Obterelemento(3));
    }
    
    @Test
    public void teste8(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.inserir(20);
        assertThrows(IndexOutOfBoundsException.class,()->{l.Obterelemento(5);});
    }
    
    @Test
    public void teste9(){
        ListaEstatica l = new ListaEstatica();
        l.inserir(5);
        l.inserir(10);
        l.inserir(15);
        l.liberar();
        assertEquals(true,l.estavazia());
    }
    
    
}
