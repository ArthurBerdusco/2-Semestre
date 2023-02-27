const express = require('express');
const app = express();

app.use(express.static(__dirname + './index.html'));

app.listen(3000, function() {
  console.log('Servidor iniciado na porta 3000!');
});

