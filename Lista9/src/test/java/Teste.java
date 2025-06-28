/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.Aluno;
import Ex1.ListaEncadeada;
import Ex1.MapaDispersao;
import java.time.LocalDate;
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
public class Teste {

    @Test
    public void teste1() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        mapa.inserir(1, new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1)));
        assertEquals(mapa.buscar(1).getNome(), "Jean");
    }

    @Test
    public void teste2() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);

        mapa.inserir(1, new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1)));
        mapa.inserir(2, new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20)));
        mapa.inserir(3, new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18)));
        mapa.inserir(4, new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25)));
        System.out.println(mapa.buscar(1).getNome());
        System.out.println(mapa.buscar(2).toString());
        System.out.println(mapa.buscar(3).toString());
        System.out.println(mapa.buscar(4).toString());
    }

    @Test
    public void teste3() {
        MapaDispersao<Aluno> mapa = new MapaDispersao<>(53);
        mapa.inserir(1, new Aluno(12000, "Jean", LocalDate.of(2000, 1, 1)));
        mapa.inserir(2, new Aluno(14000, "Pedro", LocalDate.of(1999, 1, 20)));
        mapa.inserir(1, new Aluno(12500, "Marta", LocalDate.of(2001, 2, 18)));
        mapa.inserir(2, new Aluno(13000, "Lucas", LocalDate.of(1998, 11, 25)));
        System.out.println(mapa.buscar(1).toString());
        System.out.println(mapa.buscar(2).toString());
        System.out.println(mapa.buscar(3).toString());
        System.out.println(mapa.buscar(4).toString());
    }
}
