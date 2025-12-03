/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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
    public void teste1() {
        NoArvore<Integer> raiz = new NoArvore<>(1);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        raiz.setPrim(no2);
        no2.setProx(no3);
        no3.setProx(no4);
        no2.setPrim(no5);
        no5.setProx(no6);
        no6.setProx(no7);
        no3.setPrim(no8);
        no4.setPrim(no9);
        no9.setProx(no10);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(raiz);
        assertEquals(arvore.toString(), "<1<2<5><6><7>><3<8>><4<9><10>>>");
    }
    
    @Test
    public void teste2() {
        NoArvore<Integer> raiz = new NoArvore<>(1);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        raiz.setPrim(no2);
        no2.setProx(no3);
        no3.setProx(no4);
        no2.setPrim(no5);
        no5.setProx(no6);
        no6.setProx(no7);
        no3.setPrim(no8);
        no4.setPrim(no9);
        no9.setProx(no10);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(raiz);
        assertEquals(arvore.pertence(7), true);
    }
    
     @Test
    public void teste3() {
        NoArvore<Integer> raiz = new NoArvore<>(1);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        raiz.setPrim(no2);
        no2.setProx(no3);
        no3.setProx(no4);
        no2.setPrim(no5);
        no5.setProx(no6);
        no6.setProx(no7);
        no3.setPrim(no8);
        no4.setPrim(no9);
        no9.setProx(no10);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(raiz);
        assertEquals(arvore.pertence(55), false);
    }
    
     @Test
    public void teste4() {
        NoArvore<Integer> raiz = new NoArvore<>(1);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        raiz.setPrim(no2);
        no2.setProx(no3);
        no3.setProx(no4);
        no2.setPrim(no5);
        no5.setProx(no6);
        no6.setProx(no7);
        no3.setPrim(no8);
        no4.setPrim(no9);
        no9.setProx(no10);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(raiz);
        assertEquals(arvore.contarNos(), 10);
    }
}
