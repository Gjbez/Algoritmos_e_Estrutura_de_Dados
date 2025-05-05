package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Teste {
    
    @Test
    void teste1(){
    Exercicio2 lista = new Exercicio2<Integer>();
    lista.inserir(5);
    lista.inserir(10);
    lista.inserir(15);
    lista.inserir(20);
    lista.inverter();
    String valores = "20\n15\n10\n5";
    assertEquals(valores, lista.toString());
    }

    @Test
    void teste2(){
    Exercicio2 lista = new Exercicio2<Integer>();
    lista.inserir(5);
    lista.inserir(10);
    lista.inserir(15);
    lista.inserir(20);
    lista.inserir(25);
    lista.inverter();
    String valores = "25\n20\n15\n10\n5";
    assertEquals(valores, lista.toString());
    }

    @Test 
    void teste3(){
    Exercicio2 pessoa = new Exercicio2<Pessoa>();   
    pessoa.inserir(new Pessoa("P1", 10));

    Pessoa p = new Pessoa("P2", 20);
    pessoa.inserir(p);

    pessoa.inserir(new Pessoa("P3", 30));

    assertEquals(pessoa.getTamanho(), 3);

    String dados = "Pessoa [nome = P1 , idade = 10]\n" +
                   "Pessoa [nome = P2 , idade = 20]\n" +
                   "Pessoa [nome = P3 , idade = 30]\n";
     assertEquals(pessoa.toString(), dados);

     int pBusca = pessoa.buscar(p);
     assertEquals(1, pBusca);

     pessoa.retirar(p);
     dados = "Pessoa [nome = P1 , idade = 10]\n" +
                   "Pessoa [nome = P2 , idade = 20]\n" +
                   "Pessoa [nome = P3 , idade = 30]\n";
       assertEquals(pessoa.toString(), dados);

    }
}
