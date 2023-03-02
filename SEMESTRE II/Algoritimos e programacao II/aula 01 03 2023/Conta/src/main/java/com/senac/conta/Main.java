package com.senac.conta;

public class Main {
     
    public static void main(String[] args) {

        Aplicativo app = new Aplicativo();
        
        do{
            if(app.contaExistente() == false){
                app.criarConta();
            }else{
                int escolha = app.menuApp();
                app.operacao(escolha);
            }
        }while(true);
    }
}
