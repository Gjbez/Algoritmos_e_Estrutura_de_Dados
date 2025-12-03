/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.PilhaVetor;
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
    
    @Test
    public void teste1(){
        PilhaVetor<Integer> p = new PilhaVetor<>(0);
        assertTrue(p.estavazia());
    }
    
    @Test
    public void teste2(){
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
        p.push(10);
        assertFalse(p.estavazia());
    }
    
    @Test
    public void teste3(){
        PilhaVetor<Integer> p = new PilhaVetor<>(10);
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
        PilhaVetor<Integer> p = new PilhaVetor<>(3);
        p.push(10);
        p.push(20);
        p.push(30);
        assertThrows(RuntimeException.class, () -> {
            p.push(40);
        });
    }

    @Test
    public void teste05() {
        PilhaVetor<Integer> p = new PilhaVetor<>(10);
        assertThrows(RuntimeException.class, () -> {p.pop();});
    }

    @Test
    public void teste06() {
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
        p.push(10);
        p.push(20);
        p.push(30);
        assertEquals(p.peek(), 30);
        assertEquals(p.pop(), 30);
    }

    @Test
    public void teste07() {
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
        p.push(10);
        p.push(20);
        p.push(30);
        p.liberar();
        assertEquals(p.estavazia(), true);
    }

    @Test
    public void teste08() {
        PilhaVetor<Integer> p = new PilhaVetor<>(10);
        p.push(10);
        p.push(20);
        p.push(30);
        PilhaVetor<Integer> p2 = new PilhaVetor<>(10);
        p2.push(40);
        p2.push(50);
        p.concatenar(p2);
        assertEquals("50,40,30,20,10", p.toString());
    }
}
