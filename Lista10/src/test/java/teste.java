/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Ex1.OrdenacaoBolha;
import Ex1.OrdenacaoBolhaOtimizada;
import Ex1.OrdenacaoMergeSort;
import Ex1.OrdenacaoQuickSort;
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
    void teste1(){
        int[] numeros = {70,2,88,15,90,30};
        OrdenacaoBolha bolha = new OrdenacaoBolha();
        bolha.ordenar(numeros);
        bolha.setInfo(numeros);
        System.out.println(bolha.getInfo()[0]);
        System.out.println(bolha.getInfo()[1]);
        System.out.println(bolha.getInfo()[2]);
        System.out.println(bolha.getInfo()[3]);
        System.out.println(bolha.getInfo()[4]);
        System.out.println(bolha.getInfo()[5]);
        assertEquals(bolha.getInfo()[0], 2);
    }
    
    @Test
    void teste2(){
        int[] numeros = {70,2,88,15,90,30};
        OrdenacaoBolhaOtimizada bolha = new OrdenacaoBolhaOtimizada();
        bolha.setInfo(numeros);
        bolha.ordenar(numeros);
        System.out.println(bolha.getInfo()[0]);
        System.out.println(bolha.getInfo()[1]);
        System.out.println(bolha.getInfo()[2]);
        System.out.println(bolha.getInfo()[3]);
        System.out.println(bolha.getInfo()[4]);
        System.out.println(bolha.getInfo()[5]);
        //assertEquals(bolha.getInfo()[0], 2);
        System.out.println(bolha.getInfo()[0] + "," + bolha.getInfo()[1] + "," + bolha.getInfo()[2] + "," + bolha.getInfo()[3] + "," + bolha.getInfo()[4] + "," + bolha.getInfo()[5]);  
    }
}