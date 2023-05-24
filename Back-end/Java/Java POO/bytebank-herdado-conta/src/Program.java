public class Program {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        SeguroDeVida sv = new SeguroDeVida();

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("\nSaldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.resgistra(cc);
        calculadorDeImposto.resgistra(sv);
        System.out.println(cc.getValorImposto());
        System.out.println(sv.getValorImposto());
    }
}
