const clientes = requere("./cliente.json")

function encontrar(lista, chave, valor) {
    return lista.find((item) => item[chave] === valor);
}

const encontrado = encontrar(clientes, "nome", "Kirby");
const encontrado2 = encontrar(clientes, "telefone", "1918820860");

console.log(encontrado);
console.log(encontrado2);