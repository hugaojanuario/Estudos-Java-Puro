package br.com.hugoflix.dominio;

public class Filme extends Titulo{
    private String nomeDiretor;

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
