package br.com.hugoflix.domain;

import br.com.hugoflix.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporada;
    private int episodio;
    private String nomeEposiodio;

    public Serie(String nomeTitulo, int dataLancamento, int temporada, int episodio, String nomeEposiodio) {
        super(nomeTitulo, dataLancamento);
        this.temporada = temporada;
        this.episodio = episodio;
        this.nomeEposiodio = nomeEposiodio;
    }

//    public Serie(int temporada, int episodio, String nomeEposiodio) {
//        this.temporada = temporada;
//        this.episodio = episodio;
//        this.nomeEposiodio = nomeEposiodio;
//    }

    public void imprimeDetalhesSerie(){
        System.out.println("---DETALHES SERIE---");
        exibeDetalhesTitulo();
        System.out.println("Numero Temporada: "+this.temporada);
        System.out.println("Numero do EP: "+this.episodio);
        System.out.println("Nome do EP: "+this.nomeEposiodio);
        mediaAvaliacao();
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getNomeEposiodio() {
        return nomeEposiodio;
    }

    public void setNomeEposiodio(String nomeEposiodio) {
        this.nomeEposiodio = nomeEposiodio;
    }

    @Override
    public double getClassificacao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNomeTitulo();
    }
}
