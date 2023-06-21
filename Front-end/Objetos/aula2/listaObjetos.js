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

cliente.enderecos.push({
    rua: "R. Calors godin",
    numero: 403,
    apartamento: false,
});

const listaDeApartamentos = cliente.enderecos.filter(
    (endereco) => endereco.apartamento === true
);

console.log(listaDeApartamentos);