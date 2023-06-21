const cliente = {
    nome: "Iago",
    idade: 22,
    cpf: "1091111112",
    email: "Iago.cliente@gmail.com"
}

console.log(`O nome do cliente é ${cliente.nome} e essa pessoa tem ${cliente.idade} anos.`);
console.log(`Os 3 primeiros números do CPF são ${cliente.cpf.substring(0, 3)}`)