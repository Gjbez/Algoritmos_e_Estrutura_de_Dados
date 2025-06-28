/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.ListaEstatica;
import Ex1.ListaOrdenada;
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
    void teste1(){
    ListaOrdenada<Integer> lista = new ListaOrdenada<>();
    lista.inserir(100);
    lista.inserir(20);
    lista.inserir(70);
    lista.inserir(1);
    assertEquals(lista.toString(), "1,20,70,100");
    }
    
    @Test
    void teste2(){
    ListaOrdenada<Integer> lista = new ListaOrdenada<>();
    lista.inserir(0);
    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    lista.inserir(40);
    lista.inserir(50);
    lista.inserir(60);
    lista.inserir(70);
    lista.inserir(80);
    lista.inserir(90);
    lista.inserir(100);
    assertEquals(lista.buscar(20), "2");
    }
    
    @Test
    void teste3(){
    ListaOrdenada<Integer> lista = new ListaOrdenada<>();
    lista.inserir(0);
    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    lista.inserir(40);
    lista.inserir(50);
    lista.inserir(60);
    lista.inserir(70);
    lista.inserir(80);
    lista.inserir(90);
    lista.inserir(100);
    assertEquals(lista.buscar(40), "4");
    }
    
    @Test
    void teste4(){
    ListaOrdenada<Integer> lista = new ListaOrdenada<>();
    lista.inserir(0);
    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    lista.inserir(40);
    lista.inserir(50);
    lista.inserir(60);
    lista.inserir(70);
    lista.inserir(80);
    lista.inserir(90);
    lista.inserir(100);
    assertEquals(lista.buscar(70), "7");
    }
    
    @Test
    void teste5(){
    ListaOrdenada<Integer> lista = new ListaOrdenada<>();
    lista.inserir(0);
    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    lista.inserir(40);
    lista.inserir(50);
    lista.inserir(60);
    lista.inserir(70);
    lista.inserir(80);
    lista.inserir(90);
    lista.inserir(100);
    assertEquals(lista.buscar(100), "10");
    }
    
    @Test
    void teste6(){
    ListaOrdenada<Integer> lista = new ListaOrdenada<>();
    lista.inserir(0);
    lista.inserir(10);
    lista.inserir(20);
    lista.inserir(30);
    lista.inserir(40);
    lista.inserir(50);
    lista.inserir(60);
    lista.inserir(70);
    lista.inserir(80);
    lista.inserir(90);
    lista.inserir(100);
    assertEquals(lista.buscar(85), "-1");
    }
}
