package com.example;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome , int idade){
        super();
        setNome(nome);
        setIdade(idade);
    }
    
    public int getNome(){
        return idade;
    }
    
    public void setNome(String nome){
        this.idade = idade;
    }
    
    public int getIdade(){
    return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return ("Nome = " + nome + "\nIdade = " + idade + ".\n");
    }
}
