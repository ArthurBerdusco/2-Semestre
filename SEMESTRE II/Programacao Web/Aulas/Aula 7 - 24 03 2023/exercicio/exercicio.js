/** - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
 * SENAC - TADS - Programacao Web *
 * Exemplo de array *
 * Aluno - Arthur Silva Berdusco de Souza
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/

// Delcarando array
const listaDeProdutos = ["Camisa manga madura",
    "Chinelos Ava Iana",
    "Galochas happy horse",
    "Metacapacete magntico",
    "Luvas Bionicas"
];
// obtendo o tamanho da lista
console.log("Lista de Produtos possui " + listaDeProdutos.length + " itens ");
// ----------------------------------------
// acessando um item especifico
console.log("O primeiro item da lista e: " + listaDeProdutos[0] + " e o ultimo eh: " + listaDeProdutos[4]);
// acessando um item especifico
console.log(" Outra forma de chegar no ultimo item : " + listaDeProdutos[listaDeProdutos.length - 1]);
/* pesquisando um item na lista  devolve a posicao naqual se encontra o argumento
de pesquisa se nao encontrar o item , devolve -1 (um negativo )
*/
console.log(listaDeProdutos.indexOf("Galochashappy horse"));
//
// alterando um item (Em nosso exemplo : item "Chinelos Ava Iana " s e r alterado para " Chinelodo Havai ")
listaDeProdutos[1] = "Chinelo do Havai";
console.log(listaDeProdutos);
//
// Adicionando um item na lista
listaDeProdutos.push("Sacolas de palha de Coco Verde")
console.log(listaDeProdutos);
console.log(" Novo tamanho da lista : " + listaDeProdutos.length);
//
// removendo o primeiro item da listaDeProdutos : "Camisa manga madura "
listaDeProdutos.shift();
console.log(listaDeProdutos);
//
// removendo o ultimo item da listaDeProdutos : "Sacolas de palha de Coco Verde "
listaDeProdutos.pop();
console.log(listaDeProdutos);

let novoValor = "Chinelos do havai"

remover = listaDeProdutos.indexOf("Metacapacete magntico")
listaDeProdutos.splice(remover,1);
console.log(listaDeProdutos);