/* * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
 * Exemplo #02 *
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
var arrayMarcas = ['Ford', 'BMW', 'Fiat', 'Audi', 'Volkswagen'];

arrayMarcas.forEach((marca, indice) => {
    console.log("A marca " + marca + " corresponde ao indice : " + indice)
    if (marca === 'BMW') {
        let itemExcluido = arrayMarcas.splice(indice, 1)
        console.log(" Confira : Excluimos o elemento     " + itemExcluido)
    }
});
console.log(arrayMarcas)