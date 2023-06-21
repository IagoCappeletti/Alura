const cliente = {
    nome: "João",
    idade: 24,
    email: "joaocliente@firmal.com",
    telefone: ["5198746364", "2126336463"],
    saldo: 200,
    efetuaPagamento: function (valor) {
        if (valor > this.saldo) {
          console.log("Saldo insuficiente");
        } else {
          this.saldo -= valor;
          console.log(`Pagamento realizado. Novo saldo: ${this.saldo}`);
        }
      },
    };
    
    cliente.efetuaPagamento(50);