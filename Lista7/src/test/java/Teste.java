/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex.ArvoreBinaria;
import Ex.NoArvoreBinaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbez
 */
public class Teste {
   
    @Test
    public void teste1(){
        ArvoreBinaria<Integer> a = new ArvoreBinaria<>();
        assertEquals(a.estavazia(), true);
    }
    
    @Test
    public void teste2(){
        ArvoreBinaria<Integer> a = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(null);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(null);
        a.setRaiz(no2);
        assertEquals(a.estavazia(), false);
    }
    
    @Test
    public void teste3(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.toString(), "<1<2<><4<><>>><3<5<><>><6<><>>>>");
    }
    
    @Test
    public void teste4(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.pertence(1), true);
    }
    
    @Test
    public void teste5(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.pertence(3), true);
    }
    
    @Test
    public void teste6(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.pertence(6), true);
    }
    
    @Test
    public void teste7(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.pertence(10), false);
    }
    
    @Test
    public void teste8(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.contarNos(), 6);
    }
    
    @Test
    public void testedesafio(){
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        
        raiz.setDir(no3);
        no3.setEsq(no5);
        no3.setDir(no6);
        raiz.setEsq(no2);
        no2.setDir(no4);
        
         ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
         arvore.setRaiz(raiz);
         assertEquals(arvore.ToStringRaiz(2), "<2<><4<><>>>");
    }
    
}
