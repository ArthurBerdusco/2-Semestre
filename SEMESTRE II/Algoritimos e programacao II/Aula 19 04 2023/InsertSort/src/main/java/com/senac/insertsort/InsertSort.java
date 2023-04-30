package com.senac.insertsort;

import java.util.Random;


public class InsertSort {

    public static String[] gerarPalavras() {
        String[] palavras = new String[30];
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();

        for (int i = 0; i < palavras.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 6; j++) {
                int index = random.nextInt(letras.length());
                String palavra = sb.append(letras.charAt(index)).toString();
                palavras[i] = palavra;
            }
        }
        return palavras;
    }

    public static String[] organizarPalavras(String[] palavras) {
        for (int i = 1; i < palavras.length; i++) {
            String valorAtual = palavras[i];
            int j = i - 1;
            while (j >= 0 && palavras[j].compareTo(valorAtual) > 0) {
                palavras[j + 1] = palavras[j];
                j--;
            }
            palavras[j + 1] = valorAtual;
        }
        return palavras;
    }

    public static void imprimirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }
    }

    public static void main(String[] args) {
        String[] palavras = gerarPalavras();
        System.out.println("---> Palavras Desorganizadas <---");
        imprimirPalavras(palavras);
        String[] palavrasOrganizadas = organizarPalavras(palavras);
        System.out.println("\n---> Palavras Organizadas <---");
        imprimirPalavras(palavrasOrganizadas);
    }
}
