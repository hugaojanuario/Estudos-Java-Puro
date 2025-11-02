package br.com.hugoflix.dominio;

import br.com.hugoflix.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String nomeDiretor;

    public Filme(String nomeTitulo, int dataLancamento, String nomeDiretor) {
        super(nomeTitulo, dataLancamento);
        this.nomeDiretor = nomeDiretor;
    }
    @Override
    public double getClassificacao() {
        if (getTotalAvaliacao() == 0) {
            return 0.0;
        }
        return getAvaliacao() / getTotalAvaliacao();
    }


    public void imprimeDetalhesFilme(){
        System.out.println("---DETALHES FILME---");
        exibeDetalhesTitulo();
        System.out.println("Nome do Diretor: "+this.nomeDiretor);
        mediaAvaliacao();
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }


    @Override
    public String toString() {
        return "Filme: " + this.getNomeTitulo();
    }
}
