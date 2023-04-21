package com.senac.lojainformatica.utils;

import java.util.ArrayList;
import javax.swing.JComboBox;

public class Validador {

    public ArrayList<String> listaErros = new ArrayList<>();

    public boolean validarComboBox(JComboBox cbo) {
        boolean retorno = false;
        try {
            if (cbo.getSelectedIndex() == 0) {
                throw new Exception("Preencha o combo box");
            } else {
                retorno = true;
            }
        } catch (Exception e) {
            listaErros.add(e.getMessage());
        }
        return retorno;
    }
}
