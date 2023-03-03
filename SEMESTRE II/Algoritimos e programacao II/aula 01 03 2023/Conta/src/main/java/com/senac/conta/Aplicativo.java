package com.senac.conta;

import java.util.Scanner;

public class Aplicativo {
    
    private Conta conta;
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
    public boolean contaExistente(){
        boolean existente;
        if(conta == null ){
            existente = false;
        }else{
            existente = true;
        }
        return existente;
    };
      
    public void criarConta(){
        Scanner input = new Scanner(System.in);
        System.out.println("+---------------------+  \n"
                         + "|  Menu da conta:     |  \n"
                         + "+---------------------+  \n"
                         + "|  [ 1 ] Criar conta  |  \n"
                         + "|  [ 2 ] Sair         |  \n"
                         + "+---------------------+  ");
        int escolha = input.nextInt();
        if(escolha == 1){
            conta = new Conta();
        }else if(escolha == 2){
            System.exit(0);
        }
    }
    
    public int menuApp(){
        Scanner input = new Scanner(System.in);
        System.out.println("+--------------------+  \n"
                         + "|  Menu da conta:    |  \n"
                         + "+--------------------+  \n"
                         + "|  [ 1 ] Depositar   |  \n"
                         + "|  [ 2 ] Sacar       |  \n"
                         + "|  [ 3 ] Ver saldo   |  \n"
                         + "|  [ 4 ] Sair        |  \n"
                         + "+--------------------+  ");
        int escolha = input.nextInt();
        return escolha;
    }
    
    
    public void operacao(int escolha){

            switch(escolha){
            case 1:
                conta.depositar();
                break;
            case 2:
                conta.sacar();
                break;
            case 3:
                System.out.println("Saldo atual: " + conta.getSaldo());
                break;
            case 4:
                System.exit(0);
                break;
          
        }      
    }  
}
