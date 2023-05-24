public class Program {
    public static void main(String[] args) {

        Conta conta = new Conta(1010,1337);
        Conta conta1 = new Conta(1010,2912);
        Conta conta2 = new Conta(1010,888838);

        System.out.println("Total de contas: " + Conta.getTotalContas());

    }
}
