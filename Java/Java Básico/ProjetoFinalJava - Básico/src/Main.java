import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("Digite os dados: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Tipo de conta: ");
        String tipoConta = sc.next();
        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        System.out.println("\n******************************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: R$%.2f%n", saldoInicial);
        System.out.println("******************************************\n");

        while (true) {
            System.out.println();
            System.out.println("Operações: ");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("Qual opção você deseja: ");
        int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo disponivel é: %.2f", saldoInicial);
                    break;
                case 2:
                    System.out.print("Qual valor você vai receber? ");
                    double valorReceber = sc.nextDouble();
                    saldoInicial += valorReceber;
                    System.out.printf("Saldo atualizado: %.2f", saldoInicial);
                    break;
                case 3:
                    System.out.print("Qual valor você quer transferir? ");
                    double valorTransferencia = sc.nextDouble();
                    if (valorTransferencia < 0){
                        System.out.println("Valor menor que disponivel em conta");
                    } else if (valorTransferencia > saldoInicial) {
                        System.out.println("Valor maior que disponivel em conta");
                    } else {
                        saldoInicial -= valorTransferencia;
                        System.out.printf("Saldo atualizado: %.2f", saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Até a proxima !!!!");
                    return;
                default:
                    System.out.println("O número escolhido é inválido!");
            }
        }
    }
}
