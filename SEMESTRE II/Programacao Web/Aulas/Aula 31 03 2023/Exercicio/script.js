listaCarros = ['Ford',
    'BMW',
    'Fiat',
    'Audi',
    'VolksVagen'
]


for (i = 0; i < listaCarros.length; i++) {
    listaCarros.innerHTML += `<li><a href="#">${listaCarros.children.length + 1} - ${listaCarros[i]}</a></li>`;
}
