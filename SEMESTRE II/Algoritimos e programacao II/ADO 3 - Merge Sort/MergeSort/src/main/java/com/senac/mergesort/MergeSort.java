package com.senac.mergesort;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int[] lista = criarArray();
        System.out.println("Array antes da ordenação:");
        imprimirLista(lista);

        mergeSort(lista, 0, lista.length - 1);
        System.out.println("\n\nArray após a ordenação Merge Sort:");
        imprimirLista(lista);
    }

    //Cria o Array de tamanho 15 ocorrências aleatórios não iguais na faixa de 1 a 100;
    public static int[] criarArray() {
        int[] lista = new int[15];
        Random random = new Random();

        int count = 0;
        do {
            int numRandom = random.nextInt(100) + 1;
            if (!checarNumRepetido(lista, numRandom)) {
                lista[count] = numRandom;
                count++;
            }
        } while (count < 15);

        return lista;
    }

    //Método para verificar se um número já está em um array;
    private static boolean checarNumRepetido(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    //Método MergeSort para organização do array
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    //Método merge para mesclar as duas metades do array em ordem crescente
    public static void merge(int[] array, int left, int middle, int right) {
        int size1 = middle - left + 1;
        int size2 = right - middle;

        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        for (int i = 0; i < size1; i++) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < size2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void imprimirLista(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + ", ");
        }
    }
}
