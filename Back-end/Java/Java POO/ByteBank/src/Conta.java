

public class Conta {
    private Double saldo;
    private Integer agencia;
    private Integer numero;
    private Cliente titular;
    private static Integer totalContas = 0;

    public Conta(Integer agencia, Integer numero) {
        Conta.totalContas++;
        System.out.println("O total de contas é: " + totalContas);

        this.agencia = agencia;
        this.numero = numero;
        System.out.println("NúmeroDaConta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static Integer getTotalContas() {
        return totalContas;
    }
}
