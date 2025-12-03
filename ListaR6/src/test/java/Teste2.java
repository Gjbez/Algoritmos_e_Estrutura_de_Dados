/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex2.FilaLista;
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
public class Teste2 {
    
    @Test
    public void teste01() {
        FilaLista<Integer> fila = new FilaLista<>();
        assertEquals(fila.estavazia(), true);
    }

    @Test
    public void teste02() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        assertEquals(fila.estavazia(), false);
    }

    @Test
    public void teste03() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(fila.retirar(), 10);
        assertEquals(fila.retirar(), 20);
        assertEquals(fila.retirar(), 30);
        assertEquals(fila.estavazia(), true);
    }

    @Test
    public void teste04() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(30);
        fila.inserir(20);
        fila.inserir(10);
        assertEquals(fila.peek(), 30);
        assertEquals(fila.retirar(), 30);
    }

    @Test
    public void teste05() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertEquals(fila.estavazia(), true);
    }
}
