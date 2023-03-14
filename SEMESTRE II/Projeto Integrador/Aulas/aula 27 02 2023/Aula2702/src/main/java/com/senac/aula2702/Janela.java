package com.senac.aula2702;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Janela {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Não foi possível definir a aparência do sistema");
        }
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}
