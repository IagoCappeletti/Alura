public class Program {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O podereso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.incluindoNoPlano = true;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.pegaMedia());
    }
}