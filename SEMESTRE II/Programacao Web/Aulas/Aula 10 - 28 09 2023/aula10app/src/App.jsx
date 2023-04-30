import CadastrarCliente from "./components/cadastrarCliente"
import MenuCadastro from "./components/menuCadastro"
import { useState } from 'react';


function App() {

  const nome = "Teste";
  
  return (
    <>
      <MenuCadastro />
      <CadastrarCliente nome="Ola" idade="asd" cpf="teste"/>
    </>
  )
}

export default App
