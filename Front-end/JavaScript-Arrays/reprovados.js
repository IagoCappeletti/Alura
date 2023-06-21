const alunos = ["Ana", "Marcos", "Maria", "Marco"];
const media = [7, 4.5, 8, 7.5];

const reprovados = alunos.filter((_, i) => {
    return media[i] < 7;
});

console.log(reprovados);
