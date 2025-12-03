
import Ex1.Aluno;
import Ex1.MapaDispersao;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gbez
 */
public class Teste {

    private static MapaDispersao<Integer,Aluno> x;

    public Teste() {
        
        // @Teste1: 
        //Validar que o método insere um um dado novo no mapa de dispersão e consegue localizá-lo.
        x = new MapaDispersao<>(53);

        Aluno ob1 = new Aluno(12000, "Jean", "2000-01-01");

        x.inserir(ob1.getMatricula(), ob1);
        
        if (x.buscar(12000).equals(ob1)) {
            System.out.println("Teste 1: verdadeiro");
        } else {
            System.out.println("Teste 1: falso");            
        }

        // @Teste2:
        // Validar que o método insere mais de um objeto no mapa de dispersão, localizando os diversos objetos.
        x = new MapaDispersao<>(53);

        //Aluno ob1 = new Aluno(12000, "Jean", "2000-01-01");
        Aluno ob2 = new Aluno(14000, "Pedro", "1999-01-20");
        Aluno ob3 = new Aluno(12500, "Marta", "2001-02-18");
        Aluno ob4 = new Aluno(13000, "Lucas", "1998-11-25");

        x.inserir(ob2.getMatricula(), ob2);
        x.inserir(ob3.getMatricula(), ob3);
        x.inserir(ob4.getMatricula(), ob4);

        if (x.buscar(14000).equals(ob2) && x.buscar(12500).equals(ob3) && x.buscar(13000).equals(ob4)) {
            System.out.println("Teste 2: verdadeiro");
        } else {
            System.out.println("Teste 2: falso");            
        }

        // @Teste3:
        // Validar inserção e busca de objetos quando há colisão
        x = new MapaDispersao<>(53);

        //Aluno ob1 = new Aluno(12000, "Jean", "2000-01-01");
        Aluno ob5 = new Aluno(14000, "Pedro", "1999-01-20");
        Aluno ob6 = new Aluno(14226, "Marta", "2001-02-18"); // Houve colisão aqui
        Aluno ob7 = new Aluno(17180, "Lucas", "1998-11-25"); // Houve colisão aqui também

        x.inserir(ob5.getMatricula(), ob5);
        x.inserir(ob6.getMatricula(), ob6);
        x.inserir(ob7.getMatricula(), ob7);

        if (x.buscar(14000).equals(ob5) && x.buscar(14226).equals(ob6) && x.buscar(17180).equals(ob7)) {
            System.out.println("Teste 3: verdadeiro");
        } else {
            System.out.println("Teste 3: falso");            
        }
    }
    public static void main(String[] args) {
        new Teste();
    }
}
