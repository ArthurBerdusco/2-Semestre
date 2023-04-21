package com.senac.lojainformatica.main;

import com.senac.lojainformatica.view.TelaComputador;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            new TelaComputador().setVisible(true);
        }catch(Exception e){
            System.out.println("Não foi possivel definir o estilo do sistema");
            new TelaComputador().setVisible(true);
        }
    }
}
