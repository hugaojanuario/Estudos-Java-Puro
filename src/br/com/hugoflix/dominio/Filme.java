package br.com.hugoflix.dominio;

import br.com.hugoflix.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String nomeDiretor;

    @Override
    public double getClassificacao() {
            return 0;
    }

    public Filme(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
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
}
