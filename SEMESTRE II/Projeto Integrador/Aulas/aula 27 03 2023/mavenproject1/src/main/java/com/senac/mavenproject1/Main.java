package com.senac.mavenproject1;

import javax.swing.UIManager;

public class Main {

    
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new TelaCadastroProduto().setVisible(true);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
