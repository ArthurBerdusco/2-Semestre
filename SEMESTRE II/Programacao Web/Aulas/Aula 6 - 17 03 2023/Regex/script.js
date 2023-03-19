var regNome = new RegExp("[A-z]{6,100}");
var regSenha = new RegExp("^(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9])(?=.*[a-z]).{6,25}$");
var regEmail = new RegExp("([!#-'*+/-9=?A-Z^-~-]+(\.[!#-'*+/-9=?A-Z^-~-]+)*|\"\(\[\]!#-[^-~ \t]|(\\[\t -~]))+\")@([!#-'*+/-9=?A-Z^-~-]+(\.[!#-'*+/-9=?A-Z^-~-]+)*|\[[\t -Z^-~]*])");
var regMsg = new RegExp("[0-9A-z ]{10,1000}");
var deny = [
    "password",
    "12345678",
    "8675309",
    "or 1=1",
    "qwerty",
    "<script>",
    "window.location.href",
    "zxcvb",
    "letmein",
    "trustno1",
    "omnicloud",
    "monkey"
];
var regDeny = new RegExp(deny.join("|", "i"));

function validar(){
    if(!regNome.test(nome.value) || regDeny.test(nome.value)){
        alert("Informe o nome completo!");
        return false;
    }
    
    if(!regSenha.test(senha.value) || regDeny.test(senha.value)){
        alert("Informe uma senha forte!");
        return false;
    }

    if(senhaConfirm.value != senha.value){
        alert("Confirmação de senha inválida!")
        return false;
    }
    
    if(!regEmail.test(email.value) || regDeny.test(email.value)){
        alert("Informe um e-mail válido")
        return false;
    }

    if(!regMsg.test(mensagem.value) || regDeny.test(mensagem.value)){
        alert("Mensagem inválida!")
        return false;
    }



    alert("Tudo certo!");
}