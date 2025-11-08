package br.com.hugoflix.test;

import br.com.hugoflix.api.BuscaFilme;

import java.io.IOException;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        BuscaFilme buscaFilme = new BuscaFilme();
        buscaFilme.buscaFilme();

    }
}
