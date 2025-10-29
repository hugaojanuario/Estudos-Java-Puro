package br.com.hugoflix.dominio;

import br.com.hugoflix.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie Serie;
    private int totalVisualizacoes;


    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return Serie;
    }

    public void setSerie(Serie serie) {
        Serie = serie;
    }

    @Override
    public double getClassificacao() {
        return 0;
    }
}
