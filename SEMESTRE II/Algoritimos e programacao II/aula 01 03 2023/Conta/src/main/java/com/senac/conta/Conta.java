package com.senac.conta;

import java.util.Scanner;

public class Conta {
    //Atributos classe
    private int numero;
    private String nome_titular;
    private double saldo;
    
    public Conta(){
        this.setNome_titular();
    }

    //Getters & Seters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do títular: ");
        this.nome_titular = input.next();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Comportamentos
    public void depositar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de depósito: ");
        this.saldo += input.nextDouble();
        System.out.println("depósito efetuado com sucesso");
    }
    
    public boolean sacar(){
        Scanner input = new Scanner(System.in);
        boolean saqueConcluido;
        
        System.out.println("Digite o valor desejado de saque: ");
        double valorDesejado = input.nextDouble();
        if(this.saldo >= valorDesejado){
            this.saldo -= valorDesejado;
            saqueConcluido = true;
        }else{
            
            System.err.println("Saldo insuficiente");
            saqueConcluido = false;
        }
        return saqueConcluido;
    }
 
}
