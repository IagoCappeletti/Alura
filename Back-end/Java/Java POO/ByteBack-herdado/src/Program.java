public class Program {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Iago");
        g1.setSalario(5000.0);
        g1.setSenha(1313);

        EditorDeVideo ev = new EditorDeVideo();
        ev.setNome("Pedro");
        ev.setSalario(2500.0);

        Cliente cliente = new Cliente();
        cliente.setSenha(102);

        Administrador adm = new Administrador();
        adm.setNome("Gabriel");
        adm.setSalario(2000.0);
        adm.setSenha(1111);


        ControleBonificacao controle = new ControleBonificacao();
        System.out.println(g1.getBonificacao());
        System.out.println(ev.getBonificacao());
        System.out.println();
        controle.registra(g1);
        controle.registra(ev);

        System.out.println(controle.getSoma());

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(adm);
        si.autentica(cliente);

    }
}
