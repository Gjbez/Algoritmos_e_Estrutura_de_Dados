/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex2.PilhaVetor;
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
        PilhaVetor<Integer> p = new PilhaVetor<>();
        assertEquals(p.estavazia(), true);
    }

    @Test
    public void teste02() {
        PilhaVetor<Integer> p = new PilhaVetor<>();
        p.push(10);
        assertEquals(p.estavazia(), false);
    }

    @Test
    public void teste03() {
        PilhaVetor<Integer> p = new PilhaVetor<>();
        p.push(10);
        p.push(20);
        p.push(30);
        assertEquals(p.pop(), 30);
        assertEquals(p.pop(), 20);
        assertEquals(p.pop(), 10);
        assertEquals(p.estavazia(), true);
    }

    @Test
    public void teste04() {
        PilhaVetor<Integer> p = new PilhaVetor<>();
        p.push(10);
        p.push(20);
        p.push(30);
        assertEquals(p.peek(), 30);
        assertEquals(p.pop(), 30);
    }

    @Test
    public void teste05() {
        PilhaVetor<Integer> p = new PilhaVetor<>();
        p.push(10);
        p.push(20);
        p.push(30);
        p.liberar();
        assertEquals(p.estavazia(), true);
    }
}
