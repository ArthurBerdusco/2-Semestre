package com.senac.pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoas[] = new Pessoa[5];

        for (int i = 0; i < 1; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.cadastrarPessoa();
            pessoa.falar("Olá mundo");
            pessoas[i] = pessoa;

        }

        System.out.println(pessoas[0].getNome());
        System.out.println(pessoas[0].toString());

    }
}
