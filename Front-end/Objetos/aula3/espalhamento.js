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

const encomenda = {
    destinatario: cliente.nome,
    ...cliente.enderecos[0],
  };
  
  console.log(encomenda);