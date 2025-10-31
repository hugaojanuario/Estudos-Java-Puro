package br.com.hugoflix.teste;
import br.com.hugoflix.calculos.Recomendacao;
import br.com.hugoflix.dominio.Episodio;
import br.com.hugoflix.dominio.Filme;
import br.com.hugoflix.dominio.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainTeste {
    public static void main(String[] args) {
        Recomendacao filtro = new Recomendacao ();

        Serie mrRobots = new Serie(7,18,"A volta dos que não foram");
        mrRobots.setNomeTitulo("MrRobots");
        mrRobots.avalia(10.0);
        mrRobots.avalia(9.4);
        mrRobots.avalia(3.0);
        mrRobots.setDataLancamento(1999);
        mrRobots.imprimeDetalhesSerie();
        filtro.filtra(mrRobots);
        System.out.println();

        Filme truqueDeMestre = new Filme("Diretora Maria Rita");
        truqueDeMestre.setNomeTitulo("TruqueDeMestre");
        truqueDeMestre.setDataLancamento(1967);
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
        System.out.printf(listaFilmes.get(0).getNomeTitulo() + "\n");
        System.out.println(listaFilmes);



    }
}
