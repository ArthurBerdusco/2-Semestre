
package com.senac.pessoa;

import java.util.Scanner;

public class DadosPessoa {
    public void cadastrarPessoa(Pessoa pessoa){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        pessoa.setNome(input.nextLine());
        
        System.out.println("Digite o idade: ");
        pessoa.setIdade(input.nextInt());
        
        System.out.println("Digite o peso: ");
        pessoa.setPeso(input.nextDouble());
        
        System.out.println("Digite o altura: ");
        pessoa.setAltura(input.nextDouble());
        
    }
}
