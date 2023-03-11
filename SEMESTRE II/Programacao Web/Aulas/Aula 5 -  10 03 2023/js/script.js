/*
========== Centro Universitário SENAC ============== 
        Anáslie e Desenvolvimento de sistemas
                Programação Web
                Aluno - Arthur Silva
                2ºB - sala I331(antiga) - sala F279
==================================================== 
*/


//Entrada de dados
var idadeArthur = 150

//Função para descobrir a classe
function descobrirClasse(idade) {
    let classe;
    if((idade >= 0) && (idade <= 15)){
        classe = "Criança"
    }else if((idade >= 16) && (idade <= 18)){
        classe = "Adolescente"
    }else if((idade >= 19) && (idade <= 30)){
        classe = "Jovem"
    }else if((idade >= 31) && (idade <= 40)){
        classe = "Adulto"
    }else if(idade > 40){
        classe = "Idoso"
    }
    return classe
}

//Função para imprimir a classe da pessoa
function imprimirClasse(classe, idade){
    console.log(`A classe de quem tem ${idade} anos é ---> "${classe}"`)
}


//Utilização das funções
let classe = descobrirClasse(idadeArthur)
imprimirClasse(classe, idadeArthur)