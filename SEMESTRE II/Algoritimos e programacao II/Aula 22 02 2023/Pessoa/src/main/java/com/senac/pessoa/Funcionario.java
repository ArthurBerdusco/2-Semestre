package com.senac.pessoa;

public class Funcionario extends Pessoa{
    
    String cargo;
    double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public void falar(String frase){
        System.out.println("Eu sou o funcionario : " + frase);
    }
    
}
