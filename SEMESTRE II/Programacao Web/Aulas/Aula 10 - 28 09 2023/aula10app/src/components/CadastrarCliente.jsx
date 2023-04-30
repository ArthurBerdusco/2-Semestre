function CadastrarCliente(props){
    return(
        <div>
            <p id="nomeTeste">Nome: {props.nome}</p>
            <p>Idade: {props.idade}</p>
            <p>CPF: {props.cpf}</p>
        </div>
    )
}

export default CadastrarCliente