// Array que irá armazenar os produtos
let produtos = [];

// Função para adicionar um novo produto na lista
function adicionarProduto() {
  // Obtém o valor do input
  let nomeProduto = document.getElementById("produto").value.trim();
  
  // Verifica se o nome do produto foi informado
  if (nomeProduto.length == 0) {
    alert("Por favor, informe o nome do produto");
    return;
  }
  
  // Adiciona o novo produto no array
  let novoProduto = { id: produtos.length + 1, nome: nomeProduto };
  produtos.push(novoProduto);
  
  // Limpa o valor do input
  document.getElementById("produto").value = "";
  
  // Atualiza a lista de produtos na tela
  atualizarListaProdutos();
}

// Função para limpar o valor do input de produto
function limparProduto() {
  document.getElementById("produto").value = "";
}

// Função para atualizar a lista de produtos na tela
function atualizarListaProdutos() {
  let tbody = document.getElementById("tbody");
  
  // Limpa a tabela de produtos
  tbody.innerHTML = "";
  
  // Preenche a tabela de produtos com os itens do array
  produtos.forEach(function (produto) {
    let tr = document.createElement("tr");
    
    let tdId = document.createElement("td");
    tdId.textContent = produto.id;
    tdId.classList.add("center");
    tr.appendChild(tdId);
    
    let tdNome = document.createElement("td");
    tdNome.textContent = produto.nome;
    tdNome.classList.add("center");
    tr.appendChild(tdNome);
    
    let tdAcoes = document.createElement("td");
    tdAcoes.classList.add("center");
    
    let botaoAlterar = document.createElement("button");
    botaoAlterar.textContent = "Alterar";
    botaoAlterar.addEventListener("click", function() {
      alert("Função indisponível no momento");
    });
    tdAcoes.appendChild(botaoAlterar);
    
    let botaoExcluir = document.createElement("button");
    botaoExcluir.textContent = "Excluir";
    botaoExcluir.addEventListener("click", function() {
      excluirProduto(produto.id);
    });
    tdAcoes.appendChild(botaoExcluir);
    
    tr.appendChild(tdAcoes);
    
    tbody.appendChild(tr);
  });
}

// Função para excluir um produto da lista
function excluirProduto(idProduto) {
  // Filtra o array para remover o produto com o id informado
  produtos = produtos.filter(function (produto) {
    return produto.id != idProduto;
  });
  
  // Atualiza a lista de produtos na tela
  atualizarListaProdutos();
}