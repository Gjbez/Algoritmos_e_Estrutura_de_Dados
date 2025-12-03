/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gbez
 */
public class Aluno {
    private int matricula;
    private String nome;
    private LocalDate dataNascimento;

    public Aluno(int matricula, String nome, String dataNascimento) {
        setMatricula(matricula);
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        String dataNascimento = formatarData(this.dataNascimento);
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        String dataNascimentoFormatada = formatarData(this.dataNascimento);
        dataNascimento = dataNascimentoFormatada;
    }

    public String formatarData(LocalDate dataNascimento) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dataFormatada = formatador.format(this.dataNascimento);
        return dataFormatada;
    }
}
