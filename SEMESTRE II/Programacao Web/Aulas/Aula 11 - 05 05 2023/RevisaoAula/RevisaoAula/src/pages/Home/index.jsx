import Formulario from "./Formulario";

function Home() {

    return (
        <div>
            <div>
                <h2>
                    Pagina principal
                </h2>
                <ul>
                    <li>
                        Bolo de chocolate
                    </li>
                    <li>
                        Bolo de brigadeiro
                    </li>
                    <li>
                        Bolo formigueiro
                    </li>
                </ul>
            </div>
            <div>
                <Formulario />
            </div>
        </div>
    )
}

export default Home;