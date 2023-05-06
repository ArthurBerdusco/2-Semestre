function TabelaBrinquedos() {

    const editar = () => {
        alert("Função em produção!")
    }

    const deletar = () => {
        alert("Função em produção!")
    }

    const brinquedoDB = [
        ["Bola Oficial Nike", "Nike", "R$600"],
        ["Patinete", "Caloi", "R$250"],
        ["Bicicleta", "Caloi", "R$980"],
        ["Skate", "Caloi", "R$350"],
        ["Boneco Homem Aranha", "Hihappy", "R$150"],
    ]

    const linhasTabela = []

    brinquedoDB.forEach((brinquedo) => {
        const linha = (
            <tr>
                <td>{brinquedo[0]}</td>
                <td>{brinquedo[1]}</td>
                <td>{brinquedo[2]}</td>
                <td>
                    <button onClick={editar}>Editar</button>
                    <button onClick={deletar}>Deletar</button>
                </td>
            </tr>
        )
        linhasTabela.push(linha)
    })

    return (
        <div>
            <h2>Gerenciar Brinquendos em Estoque:</h2>
            <table style={{ borderCollapse: 'collapse', width: '40%' }}>
                <thead>
                    <tr style={{ border: '1px solid black', padding: '8px' }}>
                        <td style={{ border: '1px solid black', padding: '8px' }}>
                            Descrição
                        </td>
                        <td style={{ border: '1px solid black', padding: '8px' }}>
                            Fabricante
                        </td >
                        <td style={{ border: '1px solid black', padding: '8px' }}>
                            Valor
                        </td>
                        <td style={{ border: '1px solid black', padding: '8px' }}>
                            Gerenciar
                        </td>
                    </tr>
                </thead>
                <tbody id="tbody">
                    {linhasTabela}
                </tbody>
            </table>
        </div>
    )
}




export default TabelaBrinquedos