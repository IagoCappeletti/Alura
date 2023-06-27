const cliente = {
    nome: "João",
    idade: 24,
    email: "joaocliente@firmal.com",
    telefone: ["5198746364", "2126336463"],
};

cliente.enderecos = [
    {
        rua: "R. Joseph Climber",
        numero: 1337,
        apartamento: true,
        complemento: "Ap 999",
    },
];

for(let chave in cliente) {
    let tipo = typeof cliente[chave];
    if (tipo !== "object" && tipo !== "function") {
      console.log(`A chave ${chave} tem o valor ${cliente[chave]}`);
    }
  }