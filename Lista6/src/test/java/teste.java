/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ex1.FilaVetor;
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
    public void teste01() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);
        assertEquals(fila.estavazia(), true);
    }

    @Test
    public void teste02() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        assertEquals(fila.estavazia(), false);
    }

    @Test
    public void teste03() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);
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
        FilaVetor<Integer> fila = new FilaVetor<>(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertThrows(RuntimeException.class, () -> {
            fila.inserir(40);
        });
    }

    @Test
    public void teste05() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);
        assertThrows(RuntimeException.class, () -> {
            fila.retirar();
        });
    }

    @Test
    public void teste06() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(30);
        fila.inserir(20);
        fila.inserir(10);
        assertEquals(fila.peek(), 30);
        assertEquals(fila.retirar(), 30);
    }

    @Test
    public void teste07() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertEquals(fila.estavazia(), true);
    }

    @Test
    public void teste08() {
        FilaVetor<Integer> f1 = new FilaVetor<>(10);
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        FilaVetor<Integer> f2 = new FilaVetor<>(3);
        f1.criarFilaConcatenada(f2);
        assertEquals(f1.toString(), "50, 40, 30, 20, 10");
    }
}
