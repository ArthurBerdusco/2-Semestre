package com.senac.aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarLista {
    
    public static void printLista(List<Aluno> listaAlunos){
        //Utilizar a condição com hardcode pegando o valor do metodo size traz grande eficiencia porque
        //Se o tamanho da lista for muito grande ele tem que usar o metodo da classe size varias vezes
        int tamanhoLista = listaAlunos.size();
        for(int i = 0; i < tamanhoLista; i++){
            System.out.println("ALUNO: " + listaAlunos.get(i).getNome() + " | IDADE: " + listaAlunos.get(i).getIdade() + " | NOTA: " + listaAlunos.get(i).getNota());
        }
    }
    
    public static void main(String[] args) {
        
        List<Aluno> listaAlunos = new ArrayList<>();
        
        listaAlunos.add(new Aluno("Arthur", 18, 7.7));
        listaAlunos.add(new Aluno("Maria", 27, 9.8));
        listaAlunos.add(new Aluno("Fernando", 33, 8.5));
        listaAlunos.add(new Aluno("Joao", 25, 5.6));
        
        listaAlunos.sort(Comparator.comparing(Aluno::getNota));
        
        printLista(listaAlunos);
        
    }
}
