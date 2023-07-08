package br.com.alura.screenmatch.program;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O podereso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Minions", 2015);
        outroFilme.avalia(7);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

      //Para cada item da minha lista
        for (Titulo item: lista ) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Iago");
        buscaPorArtista.add("Pedro");
        buscaPorArtista.add("Adam");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("\nDepois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("\nlista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nOrdenando por ano: " + lista);
    }
}
