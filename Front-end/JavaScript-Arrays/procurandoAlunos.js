const alunos = ["Iago", "Pedro", "Gabi"];
const notas = [10, 8, 7.5, 9];

const listaDeAlunosEMedia = [alunos, notas];

function exibeNomeENota(aluno) {
    if (listaDeAlunosEMedia[0].includes(aluno)) {
        const [alunos, medias] = listaDeAlunosEMedia;

        const indice = alunos.indexOf(aluno);

        const mediaDoAluno = medias[indice];

        console.log(`${aluno} tem a média ${mediaDoAluno}.`);
    } else {
        console.log("Aluno não encontrado!");
    }
}

exibeNomeENota("Iago");