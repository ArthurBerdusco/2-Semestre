const express = require('express');

const server = express();

server.use(express.json());


const listaProduto = ["Bola de futebol", "Carrinho de controle remoto", "Boneca barbie", "Boneco homem-aranha"];


//REST
//READ
server.get('/produto', (req,res)=>{
    res.json(listaProduto);
})

server.get('/produto/:id', (req,res)=>{
    const idProduto = req.params.id;
    res.json(listaProduto[idProduto])
})


//CREATE
server.post('/produto',(req,res)=>{
    const {nomeProduto} = req.body;
    listaProduto.push(nomeProduto)
    res.json(listaProduto)
})


//UPDATE
server.put('/produto/:id', (req,res)=>{
    const {nomeProduto} = req.body;
    const indice = req.params.id;

    listaProduto[indice] = nomeProduto;

    res.json(listaProduto)
})

//DELETE
server.delete('/produto/:id', (req,res)=>{
    const indice = req.params.id;
    listaProduto.splice(indice, 1);
    res.json(listaProduto);
})


server.listen(3000);