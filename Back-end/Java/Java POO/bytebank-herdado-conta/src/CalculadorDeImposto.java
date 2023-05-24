public class CalculadorDeImposto implements Tributavel {
    private double totalImposto;

    public void resgistra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }
    @Override
    public double getValorImposto() {
        return totalImposto;
    }
}
