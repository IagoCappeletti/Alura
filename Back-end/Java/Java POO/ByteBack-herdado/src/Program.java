public class Program {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Iago");
        g1.setSalario(5000.0);

        EditorDeVideo ev = new EditorDeVideo();
        ev.setNome("Pedro");
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        System.out.println(g1.getBonificacao());
        System.out.println(ev.getBonificacao());
        System.out.println();
        controle.registra(g1);
        controle.registra(ev);

        System.out.println(controle.getSoma());

    }
}
