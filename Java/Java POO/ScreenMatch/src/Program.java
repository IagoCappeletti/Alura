import br.com.alura.screenmatch.modelos.Filme;

public class Program {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O podereso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluindoNoPlano(true);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}