function initInfo() {
  for (let i = 1; i <= 6; i++) {
      setTimeout(function() {
      const numID = String(i)
      let id = "postID" + numID 
      var viewsModify = document.getElementById(id);
      fetch('./visualizacoes.json')
      .then(response => response.json())
      .then(data => {
        // Processa o objeto JSOS
        viewsModify.innerHTML = `<p>Visualizações: ${data[id]} </p>`;
        }, 0);    
      });
  }
}


//Lógica de incremento de visualização dos posts
document.addEventListener('click', function(event) {
//Check do id post clicado
const idDoElementoClicado = event.target.id;
const idPost = '#postID' + idDoElementoClicado;
const meuElemento = event.currentTarget.querySelector(idPost);
const meuElementoId = meuElemento.idDoElementoClicado;
console.log('O id do elemento selecionado é:', meuElementoId);

//Incremento de visualização no post conforme click
const fs = require('fs');
const jsonContent = fs.readFileSync('./visualizacoes.json');
const data = JSON.parse(jsonContent);
let value = data.meuElementoId;
value++;
data.value = value;
const updatedJson = JSON.stringify(data);
fs.writeFile('caminho/para/o/arquivo.json', updatedJson, function(err) {
  if (err) throw err;
  console.log('Arquivo JSON atualizado com sucesso!');
});

})