function converter(){
    var resultHTML = document.getElementById("result")
    var valueTemp = document.getElementById("valuetemp")
    var radioInput = document.getElementsByName("radconvert")

    var valueConvert
    var escala

    if(radioInput[0].checked){
        valueConvert = (Number(valueTemp.value) * 9/5 ) + 32 + " ºF"
        
    }else{
        valueConvert = (Number(valueTemp.value) - 32 ) * 5/9 + " ºF"
    }

    resultHTML.innerHTML = valueConvert;
}

// seleciona todas as input radio com o nome "opcao"


// adiciona um evento de mudança a todas as input radio

const opcoes = document.getElementsByName("radconvert");

// adiciona um evento de mudança a cada input radio individualmente
opcoes.forEach((radconvert) => {
    radconvert.addEventListener('change', (event) => {
    var resultHTML = document.getElementById("result")
    resultHTML.innerHTML = ""
  });
});
