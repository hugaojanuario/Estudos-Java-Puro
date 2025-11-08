package br.com.hugoflix.test;
import br.com.hugoflix.models.Recomendacao;
import br.com.hugoflix.domain.Episodio;
import br.com.hugoflix.domain.Filme;
import br.com.hugoflix.domain.Serie;

import java.util.ArrayList;

public class MainTeste {
    public static void main(String[] args) {
        Recomendacao filtro = new Recomendacao ();

        Serie mrRobots = new Serie("MrRobots", 1999,5,78,"a volta dos que nao foram");
        mrRobots.avalia(10.0);
        mrRobots.avalia(9.4);
        mrRobots.avalia(3.0);
        mrRobots.imprimeDetalhesSerie();
        filtro.filtra(mrRobots);
        System.out.println();

        Filme truqueDeMestre = new Filme("Truque de Mestre",2003, "Rtinha");
        truqueDeMestre.avalia(10);
        truqueDeMestre.avalia(10);
        truqueDeMestre.avalia(10);
        truqueDeMestre.imprimeDetalhesFilme();
        filtro.filtra(truqueDeMestre);

        var epSerie = new Episodio();
        epSerie.setSerie(mrRobots);
        epSerie.setTotalVisualizacoes(4000);
        epSerie.setNumero(34);
        filtro.filtra(epSerie);

        System.out.println("trabalhando com ArrayList");
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(truqueDeMestre);
        System.out.println(listaFilmes.get(0).getNomeTitulo() + "\n");
        System.out.println(listaFilmes);



    }
}
