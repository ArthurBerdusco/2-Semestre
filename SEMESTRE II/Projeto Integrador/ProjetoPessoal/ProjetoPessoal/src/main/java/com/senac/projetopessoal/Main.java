package com.senac.projetopessoal;

import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Não foi possível definir a aparência do sistema");
        }
        
        TelaPrincipal app = new TelaPrincipal();
        app.setVisible(true);
    }
}
