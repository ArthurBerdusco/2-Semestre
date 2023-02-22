package com.senac.pessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private int passos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPassos() {
        return passos;
    }
    
    
    public int andar(){
        passos++;
        return passos;
    }
    
    public String toString(){
        return "Pessoa[nome=" + this.nome +
               ", idade=" + this.idade + 
               ", peso=" + this.peso + 
               ", altura=" + this.altura + "]";
    }
    
}
