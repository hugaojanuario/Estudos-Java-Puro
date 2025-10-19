package br.com.hugoflix.teste;
import br.com.hugoflix.dominio.Filme;
import br.com.hugoflix.dominio.Serie;

public class MainTeste {
    public static void main(String[] args) {

        Serie avatar = new Serie(7,18,"A volta dos que não foram");
        avatar.setNomeTitulo("avatar azzul");
        avatar.avalia(10.0);
        avatar.avalia(9.4);
        avatar.avalia(3.9);
        avatar.setDataLancamento(1999);
        avatar.imprimeDetalhesSerie();
        System.out.println("-------------------");

        Filme filme = new Filme("Diretora Maria Rita");
        filme.setNomeTitulo("hugao filme");
        filme.setDataLancamento(67);
        filme.avalia(9.0);
        filme.avalia(6.4);
        filme.avalia(8.9);
        filme.imprimeDetalhesFilme();


    }
}
