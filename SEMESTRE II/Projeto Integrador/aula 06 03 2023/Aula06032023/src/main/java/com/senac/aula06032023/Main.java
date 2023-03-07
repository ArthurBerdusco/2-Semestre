package com.senac.aula06032023;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Login telaLogin = new Login();
            telaLogin.setVisible(true);

        } catch (Exception Ex) {
            System.out.println("Erro ");
        }

    }
}
