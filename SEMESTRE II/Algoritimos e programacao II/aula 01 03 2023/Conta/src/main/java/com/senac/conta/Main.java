package com.senac.conta;

import java.io.IOException;

public class Main {
     
    public static void main(String[] args) throws IOException, InterruptedException {

        Aplicativo app = new Aplicativo();
        
        do{
            if(app.contaExistente() == false){
                app.criarConta();
            }else{
                int escolha = app.menuApp();
                app.operacao(escolha);
                app.clearScreen();
            }
        }while(true);
    }
}
