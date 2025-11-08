package br.com.hugoflix.api;

import br.com.hugoflix.domain.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaFilme {
    Scanner scanner = new Scanner (System.in);
    private String nomeFilme;
    private String endereco;
    private String nomeSemEspaco;



    public void buscaFilme () throws IOException, InterruptedException{
        System.out.println("Informe o filme que deseja: ");
        this.nomeFilme = scanner.nextLine();
        this.nomeSemEspaco = nomeFilme.replace(" ", "%20");
        this.endereco = "https://www.omdbapi.com?t="+nomeSemEspaco+"&apikey=e4702f78";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);


            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("***ERRO***");
                System.out.println(e.getMessage());
            }
        }catch (IllegalArgumentException e){
            System.out.println("erro na busca verifique o endereço");
        }
        System.out.println("encerrando com sucesso");
    }

    public String getNomeSemEspaco() {
        return nomeSemEspaco;
    }

    public void setNomeSemEspaco(String nomeSemEspaco) {
        this.nomeSemEspaco = nomeSemEspaco;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
