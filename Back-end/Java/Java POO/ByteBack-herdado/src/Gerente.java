import java.util.Objects;

public class Gerente extends Funcionario{
    private int senha = 0;


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (Objects.equals(this.senha, senha)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente");
        return super.getBonificacao() + super.getSalario(); // Vem da SuperClass
    }

}
