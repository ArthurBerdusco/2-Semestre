import { useState } from "react";

function Formulario() {
    
    const [nome, setNome] = useState('');
    const [cpf, setCpf] = useState('');
    const [email, setEmail] = useState('');
    const [cep, setCep] = useState('');
    const [rua, setRua] = useState('');
    const [numero, setNumero] = useState('');

    const cadastrar = (event)=>{
        event.preventDefault();
        console.log("kk")
    }


    return (
        <form onSubmit={cadastrar}>
            <label>
                Nome:
                <input type="text" value={nome} onChage={(event) => { setNome(event.target.value)}} />
            </label>
            <br />
            <label>
                CPF:
                <input type="text" value={cpf} onChage={(event) => { setCpf(event.target.value)}} />
            </label>
            <br />
            <label>
                E-mail:
                <input type="text" value={email} onChage={(event) => { setEmail(event.target.value)}} />
            </label>
            <br />
            <label>
                CEP:
                <input type="text" value={cep} onChage={(event) => { setCep(event.target.value)}} />
            </label>
            <br />
            <label>
                Rua:
                <input type="text" value={rua} onChage={(event) => { setRua(event.target.value)}} />
            </label>
            <br />
            <label>
                Número:
                <input type="text" value={numero} onChage={(event) => { setNumero(event.target.value)}} />
            </label>
            <br />
            <button onClick={cadastrar}>Cadastrar</button>

        </form>
    )
}

export default Formulario;