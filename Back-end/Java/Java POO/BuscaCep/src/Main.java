import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();
        System.out.print("Digite um Nº de CEP: ");
        var cep = sc.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.geraJson(novoEndereco);
        }catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação! ");
        }
    }
}