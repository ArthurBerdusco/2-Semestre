function calcular(){

    const num1 = document.getElementById('num1').value
    const num2 = document.getElementById('num2').value
    const result = document.getElementById('result') 

    result.innerHTML = `Resultado = ${Number(num1) + Number(num2)}`
}

