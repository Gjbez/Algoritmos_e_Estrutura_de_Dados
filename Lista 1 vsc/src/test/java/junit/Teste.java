package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class Teste {
    
    @Test
    void teste1(){
        Exercicio1 lista = new Exercicio1();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(20);
        assertEquals("5, 10, 15, 20", lista.toString());
    }

    @Test
    void teste2(){
        Exercicio1 lista = new Exercicio1();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }

    @Test
    void teste3(){
        Exercicio1 lista = new Exercicio1();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(20);
        assertEquals(2, lista.buscar(15));
        assertEquals(-1, lista.buscar(30));
        
        lista.retirar(10);
        assertEquals("5, 15, 20", lista.toString());
        assertEquals(3, lista.getTamanho());
    }

    @Test 
    void teste6(){
        Exercicio1 lista = new Exercicio1();
        for (int i = 1; i <= 15; i++) {
            lista.inserir(i);
        }
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", lista.toString());
        assertEquals(15, lista.getTamanho());
    }

    @Test
    void teste7(){
        Exercicio1 lista = new Exercicio1();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(20, lista.obterElemento(3));
        //assertEquals(20, lista.obterElemento(5));
    }

    @Test
    void teste8(){
        Exercicio1 lista = new Exercicio1();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(20);
        lista.liberar();
        assertEquals(lista.estaVazia(), true);
}
}
