import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        char sair = 's';
        while(sair != 'n') {
            System.out.print("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.print("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.print("Digite 's' para continuar ou 'n' para sair : ");
                sair = sc.next().charAt(0);
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 'n';
            }
        }

        System.out.println("\n***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - R$ " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: R$ " +cartao.getSaldo());


    }
}
