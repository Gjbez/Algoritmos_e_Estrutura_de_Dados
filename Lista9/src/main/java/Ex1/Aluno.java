/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.time.LocalDate;

/**
 *
 * @author gbez
 */
public class Aluno {

    private int matricula;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(int matricula, String nome, LocalDate dataNascimento) {
    this.matricula = matricula;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return LocalDate.now();
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
