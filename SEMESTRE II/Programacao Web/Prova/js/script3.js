/*========= Centro Universitário SENAC ============== 
Análise e Desenvolvimento de sistemas
Programação Web
Aluno - Arthur Silva Berdusco de Souza
2ºB - Sala F279
===================================================*/

var tabelaCredito = [
    [3000, "Crédito não concedido. Cliente possui renda inferior a: ", 0, "0%"],
    [3000.00, 5000, "Crédito Aprovado. Valor liberado para crédito: ", 0.5, "50%"],
    [5000.01, 7000, "Crédito Aprovado. Valor liberado para crédito: ", 0.7, "70%"],
    [7000.01, 10000, "Crédito Aprovado. Valor liberado para crédito: ", 0.8, "80%"],
    [10000, "Crédito aprovado à íntegra. Valor liberado para crédito: ", 1, "100%"]
];

function situacaoCreditoCliente(rendaMesCliente) {
    var credito = "";
    tabelaCredito.forEach((faixaCredito, indice)=>{
        if((rendaMesCliente >= faixaCredito[0]) && (rendaMesCliente <= faixaCredito[1])){
            credito = `${faixaCredito[2]} ${faixaCredito[4]} ---> R$${rendaMesCliente*faixaCredito[3]}`;
        }else if((indice == 0) && (rendaMesCliente < faixaCredito[0])){
            credito = `${faixaCredito[1]} R$${faixaCredito[0]}`;
        }else if((indice == 4) && (rendaMesCliente > faixaCredito[0])){
            credito = `${faixaCredito[1]} R$${rendaMesCliente}`;
        }
    })
    return credito;
}

console.log(situacaoCreditoCliente(3000));


