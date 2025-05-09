/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.PilhaVetor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbez
 */
public class Teste2 {
    
    @Test
    public void teste01() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        assertEquals(pilha.estaVazia(), true);
    }

    @Test
    public void teste02() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        assertEquals(pilha.estaVazia(), false);
    }

    @Test
    public void teste03() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(pilha.pop(), 30);
        assertEquals(pilha.pop(), 20);
        assertEquals(pilha.pop(), 10);
        assertEquals(pilha.estaVazia(), true);
    }

    @Test
    public void teste04() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(pilha.peek(), 30);
        assertEquals(pilha.pop(), 30);
    }

    @Test
    public void teste05() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertEquals(pilha.estaVazia(), true);
    }
}
