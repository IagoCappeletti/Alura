package br.com.alura.mymusic.program;

import br.com.alura.mymusic.modelos.MinhasPreferidas;
import br.com.alura.mymusic.modelos.Musica;
import br.com.alura.mymusic.modelos.Podcast;

public class Program {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Vivência");
        minhaMusica.setCantor("KayBlack");
        minhaMusica.setGenero("Trap");

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 999; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Iago Cappeletti");


        for (int i = 0; i < 90; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 40; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
