package com.senac.buscabinariaado2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jsilva91
 */
public class BuscaBinariaADO2 {

    public static void iniciarBuscaBinaria() {
        System.out.println("\n+-------------------+ \n"
                           + "|  Pesquisa Binária |\n"
                           + "+-------------------+");
    }

    public static int[] criarVetor() { //Vetor de 20 posições com números não repetidos

        Set<Integer> valoresUnicos = new HashSet<>();
        Random random = new Random();
        int valorMaximo = 50;
        int numeroDePosicoes = 20;

        while (valoresUnicos.size() < numeroDePosicoes) {
            int randomValue = random.nextInt(valorMaximo) + 1;
            if (!valoresUnicos.contains(randomValue)) {
                valoresUnicos.add(randomValue);
            }
        }

        int[] vetor = new int[20];
        int indice = 0;
        for (int valor : valoresUnicos) {
            vetor[indice] = valor;
            indice++;
        }

        return vetor;
    }

    public static int[] insertSort(int[] vetor) { //Realiza a organização de um vetor em ordem crescente
        for (int i = 0; i < vetor.length; i++) {
            int j = i;
            int x = vetor[j];
            while (j > 0 && x < vetor[j - 1]) {
                vetor[j] = vetor[j - 1];
                j--;
            }
            vetor[j] = x;
        }
        return vetor;
    }

    public static int escolherNum() { //Funcao para o usúario escolher o número de pesquisa
        System.out.print("Informe o número para pesquisa: ");
        Scanner input = new Scanner(System.in);
        int procurarNum = input.nextInt();

        return procurarNum;
    }

    public static void buscaBinaria(int[] vetor, int buscarNum) { 
        boolean encontrou = false;
        int tamanhoVetor = vetor.length;
        int posicaoInicial = 0;
        int metadeVetor;
        while (posicaoInicial <= tamanhoVetor) {
            metadeVetor = (posicaoInicial + tamanhoVetor) / 2;

            if (vetor[metadeVetor] == buscarNum) {
                System.out.printf("+---------------------------------------+ \n"
                                + "|  Número %d encontrado na posição: %d  |\n"
                                + "+---------------------------------------+\n",
                        vetor[metadeVetor], metadeVetor
                );
                encontrou = true;
                break;
            }

            if (buscarNum < vetor[metadeVetor]) { //esquerda
                tamanhoVetor = metadeVetor - 1;
            } else { //direita
                posicaoInicial = metadeVetor + 1;
            }
        }

        if (buscarNum == 0) {
            System.out.println("+------------+ \n"
                             + "|  Obrigado  |\n"
                             + "+------------+");
            return;
        }
        if (!encontrou) {
            System.out.println("+-------------------------+ \n"
                             + "|  Número não encontrado  |\n"
                             + "+-------------------------+\n");
        }
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.print("\nVetor criado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int buscarNum;
        int[] vetor = criarVetor();
        int[] vetorOrganizado = insertSort(vetor);
        
        do {
            iniciarBuscaBinaria();
            imprimirVetor(vetorOrganizado);
            buscarNum = escolherNum();
            buscaBinaria(vetorOrganizado, buscarNum);
        } while (buscarNum != 0);
    }
}
