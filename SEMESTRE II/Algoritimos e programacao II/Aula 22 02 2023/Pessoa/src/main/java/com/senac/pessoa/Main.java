package com.senac.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Arthur");
        pessoa.setIdade(22);
        pessoa.setPeso(73.4f);
        pessoa.setAltura(1.71f);
        
        System.out.println(pessoa.andar());
    }
}
