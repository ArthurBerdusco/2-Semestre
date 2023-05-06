import {Link} from 'react-router-dom';

function Header(){
    return(
        <header>
            <h2>
                Header
            </h2>

            <Link to="/">Home</Link>
            <br />
            <Link to="/contato">Contato</Link>
            <br />
            <Link to="/sobre">Sobre</Link>
        </header>
    )
}

export default Header;