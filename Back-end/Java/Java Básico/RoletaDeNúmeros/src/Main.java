import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int numeroDigitadoPeloUsuario;

        System.out.println("Você tem 5 tentativas para acertar o número escolhido!!");
        System.out.println("Você deve escolher um número de 0 a 100");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nº ");
             numeroDigitadoPeloUsuario = sc.nextInt();
             if (numeroDigitadoPeloUsuario == numeroAleatorio ){
                System.out.println("Você acertou o número sorteado !");
                return;
            } else if (numeroDigitadoPeloUsuario < 0){
                 System.out.println("Você digitou um número menor que 0 ");
             } else {
                 System.out.println("Você digitou um número maior que 100 ");
             }
        }
        System.out.println("Você não conseguiu acertar o número! O número escolhido era: " + numeroAleatorio);

        sc.close();
    }
}