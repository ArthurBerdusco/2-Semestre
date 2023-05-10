import { Link } from 'react-router-dom'

function Header() {
    return (
        <header>
            <h3>
                <Link to='/' style={{ marginRight: '10px' }}>Home</Link>

                <Link to='/cliente' style={{ marginRight: '10px' }}>Clientes</Link>

                <Link to='/sobre' style={{ marginRight: '10px' }}>Sobre</Link>

                <Link to='/contato' style={{ marginRight: '10px' }}>Contato</Link>
            </h3>

        </header>
    )
}

export default Header;