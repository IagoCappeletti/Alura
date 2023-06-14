package br.com.alura.mymusic.modelos;

public class Podcast extends Audio{
    private String apresentado;
    private String descricao;

    public String getApresentador() {
        return apresentado;
    }

    public void setApresentador(String apresentado) {
        this.apresentado = apresentado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 100) {
            return 10;
        } else {
            return 8;
        }
    }
}
