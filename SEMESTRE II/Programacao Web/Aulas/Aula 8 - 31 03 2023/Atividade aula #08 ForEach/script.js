/*========== Centro Universitário SENAC ============== 
 
Análise e Desenvolvimento de sistemas
 
Programação Web
 
Aluno - Arthur Silva
 
2ºB - sala F279
======================================================*/

listaCarros = ['Ford','BMW','Fiat','Audi','VolksVagen']

function montaLista(){
    var lista = document.getElementById("list").innerHTML;
    listaCarros.forEach(carro => {
        lista+=`<li>${carro}</li>`
    });
    document.getElementById('list').innerHTML = lista
}