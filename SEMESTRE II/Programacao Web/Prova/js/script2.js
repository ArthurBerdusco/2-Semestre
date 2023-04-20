/*========= Centro Universitário SENAC =============
Anáslie e Desenvolvimento de sistemas
Programação Web
Aluno - Arthur Silva Berdusco de Souza
2ºB - Sala F279
===================================================*/

var GenerateSerie = (numero) => {
    var Serie = [];
    Serie[0] = 0;
    Serie[1] = 1;
    for (var i = 2; i < numero; i++) {
        Serie[i] = Serie[i - 2] + Serie[i - 1];
    }
    return Serie;
}
var funcaox = GenerateSerie(4);
console.log(funcaox);
