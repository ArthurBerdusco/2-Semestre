package com.senac.pessoa;

import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPassos() {
        return passos;
    }

    public int andar() {
        passos++;
        return passos;
    }

    public void cadastrarPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        this.nome = input.nextLine();

        System.out.println("Digite o idade: ");
        this.idade = input.nextInt();
//
//        System.out.println("Digite o peso: ");
//        this.peso = input.nextDouble();
//
//        System.out.println("Digite o altura: ");
//        this.altura = input.nextDouble();
    }

    public String toString() {
        return "Pessoa[nome=" + this.nome
                + ", idade=" + this.idade
                + ", peso=" + this.peso
                + ", altura=" + this.altura + "]";
    }

}
