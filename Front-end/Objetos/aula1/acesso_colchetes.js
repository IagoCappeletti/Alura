const cliente = {
    nome: "Iago",
    idade: 22,
    cpf: "1091111112",
    email: "Iago.cliente@gmail.com"
}

console.log(`O nome do cliente é ${cliente["nome"]} e essa pessoa tem ${cliente["idade"]} anos.`);

const chaves = ["nome", "idade", "cpf", "email", "altura"];

chaves.forEach((i) => {
  console.log(`A chave ${i} tem valor ${cliente[i]}`);
});