import {
    //BIBLIOTECAS
    BrowserRouter, // DENTRO DO NAVEGADOR
    Routes, // TENHO UM CONJUNTO DE ROTAS
    Route // ROTA
} from 'react-router-dom';

import Home from './pages/Home';
import SobreNos from './pages/SobreNos';
import Contato from './pages/Contato';
import Header from './components/Header';
import Cliente from './pages/Cliente';


function RouterApp(){
    return(
        <BrowserRouter>
            <Header />
            <Routes>
                <Route path='/' element={<Home />}/>
                <Route path='/sobre' element={<SobreNos />}/>
                <Route path='/contato' element={<Contato />}/>
                <Route path='/cliente' element={<Cliente />}/>
            </Routes>
        </BrowserRouter>
    )
}

export default RouterApp;