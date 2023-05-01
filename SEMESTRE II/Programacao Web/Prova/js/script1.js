/*
========== Centro Universitário SENAC ==============
Análise e Desenvolvimento de sistemas
Programação Web
Aluno - Arthur Silva Berdusco de Souza
2ºB - Sala F279
====================================================
*/
var id = 0; // ID Inicial do sistema
var listaProdutos = []; // Array de produtos
var limparProduto = () => {
    document.getElementById("produto").value = "";
}

var adicionarProduto = () => {
    if (document.getElementById("produto").value.trim() != "") {
        var nomeProduto = document.getElementById("produto").value;
        listaProdutos.push([id++, nomeProduto]);
        atualizarTblProd();
    } else {
        alert("Preencha o campo nome do produto!");
    }
}

var atualizarTblProd = () => {
    var tblHTML = document.getElementById("tbody");
    tblHTML.innerHTML = "";
    listaProdutos.forEach((produto) => {
        var novaLinha = `<tr id='${produto[0]}'>
                            <td style="text-align: center">
                                ${produto[0]}
                            </td>
                            <td style="text-align: center">
                                ${produto[1]}
                            </td>
                            <td style="text-align: center">
                                <button onClick = "alterarProduto()" style='margin-right: 10'>Alterar</button>
                                <button onClick = "removerProduto(this)">Excluir</button>
                            </td>
                        </tr>`;
        tblHTML.innerHTML += novaLinha;
    });
}

function alterarProduto() {
    alert("Função indisponivel!");
}

function removerProduto(btRemovClick) {
    var linhaRemov = btRemovClick.closest('tr'); //Procura pele elemento Pai (tr) do botao que foi clicado "Linha da tabela"
    linhaRemov.remove();
    var idProdRemov = linhaRemov.id; //Pega ID e remove do array o este produto

    listaProdutos.forEach((produto, indice) => {
        if (produto[0] == idProdRemov) {
            listaProdutos.splice(indice, 1);
        }
    });
}



