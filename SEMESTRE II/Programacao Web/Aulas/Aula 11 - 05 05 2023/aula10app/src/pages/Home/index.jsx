import MenuBusca from "../../components/MenuBusca";
import TabelaBrinquedos from "../../components/TabelaBrinquedos";
import {Link} from 'react-router-dom';

function Home(){
    return(
        <div>
            <MenuBusca />
            <TabelaBrinquedos />
            <br />

        </div>
    )
}

export default Home;