function MenuCadastro() {

    function handleSubmit(){
        var teste = (document.getElementById("nome").value); 
        document.getElementById("nomeTeste").innerHTML += teste
    }

    return (
        <div>
            <form>
                <p>Nome: </p>
                <input type="text" id="nome"/>
                <p>Idade:</p>
                <input type="text" />
                <p>Cpf:</p>
                <input type="text" />
               
            </form>
            <button onClick={handleSubmit}>Enviar</button>
        </div>
    )
}



export default MenuCadastro