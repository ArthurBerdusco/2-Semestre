import {
    //BIBLIOTECAS
    BrowserRouter, // DENTRO DO NAVEGADOR
    Routes, // TENHO UM CONJUNTO DE ROTAS
    Route // ROTA
} from 'react-router-dom';

import Home from './pages/Home';
import SobreNos from './pages/SobreNos';
import Contatos from './pages/Contatos';
import Header from './components/Header';

function RouterApp(){
    return(
        <BrowserRouter>
            <Header />
            <Routes>
                <Route path='/' element={<Home/>}/>
                <Route path='/contato' element={<Contatos/>}/>
                <Route path='/sobre' element={<SobreNos/>}/>
            </Routes>
        </BrowserRouter>
    )
}

export default RouterApp;
