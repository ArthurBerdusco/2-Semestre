//Sistemas gostam de filas
//Filas elementos ou entidades
//O primeiro que entra é o primeiro que sai - Fila de dentista
//No Java temos classes que organizam filas
//Geralmente filas tem semelhanças com listas
package com.senac.fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author jsilva91
 */
public class Fila {

    private static final Integer TAMANHO_LISTA = 10;

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <= TAMANHO_LISTA - 1; i++) {
            queue.add(random.ints(1, TAMANHO_LISTA + 100).findAny().getAsInt());
        }
        System.out.println("-------------------------");
        System.out.println("## Fila:" + queue);
        System.out.println("## Tamanho:" + queue.size());
        System.out.println("-------------------------");
        for (int i = 0; i <= TAMANHO_LISTA - 1; i++) {
            Integer elemento = queue.remove();
            System.out.println("-------------------------");
            System.out.println("## Elemento Removido:" + elemento);
            System.out.println("## Fila:" + queue);
            System.out.println("## Tamanho:" + queue.size());
            System.out.println("## Primeiro da fila: " + queue.peek());
            System.out.println("-------------------------");
        }
    }
}
