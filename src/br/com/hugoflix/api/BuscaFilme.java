package br.com.hugoflix.api;

import br.com.hugoflix.domain.Titulo;
import br.com.hugoflix.exception.ErroCompilacaoAnoException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaFilme {
    Scanner scanner = new Scanner (System.in);
    private String nomeFilme = "";
    private String endereco;
    private String nomeSemEspaco;
    List<Titulo> titulos = new ArrayList<>();

    public void menu() throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (!nomeFilme.equalsIgnoreCase("sair")){
            System.out.println("Informe o filme que deseja: ");
            this.nomeFilme = scanner.nextLine();
            if (nomeFilme.equalsIgnoreCase("sair")){
                break;
            }
            this.nomeFilme = nomeFilme.replace(" ", "%20");
            this.endereco = "https://www.omdbapi.com?t="+nomeFilme+"&apikey=e4702f78";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                try {
                    Titulo meuTitulo = new Titulo(meuTituloOmdb);
                    System.out.println(meuTitulo);

                    titulos.add(meuTitulo);

//                    FileWriter salveArquivo = new FileWriter("filmes.txt");
//                    salveArquivo.write(meuTitulo.toString());
//                    salveArquivo.close();

                } catch (NumberFormatException e) {
                    System.out.println("***ERRO***");
                    System.out.println(e.getMessage());
                }
            }catch (IllegalArgumentException e){
                System.out.println("erro na busca verifique o endereço");
            }catch (ErroCompilacaoAnoException e){
                System.out.println(e.getMensage());
            }
        }
        System.out.println(titulos);

        FileWriter salveArquivo = new FileWriter("filmes.json");
        salveArquivo.write(gson.toJson(titulos));
        salveArquivo.close();

        System.out.println("encerrando com sucesso");
    }


//    public void buscaFilme () throws IOException, InterruptedException{
//        System.out.println("Informe o filme que deseja: ");
//        this.nomeFilme = scanner.nextLine();
//        this.nomeFilme = nomeFilme.replace(" ", "%20");
//        this.endereco = "https://www.omdbapi.com?t="+nomeFilme+"&apikey=e4702f78";
//
//        try {
//            HttpClient client = HttpClient.newHttpClient();
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create(endereco))
//                    .build();
//            HttpResponse<String> response = client
//                    .send(request, HttpResponse.BodyHandlers.ofString());
//
//            String json = response.body();
//            System.out.println(json);
//
//            Gson gson = new GsonBuilder()
//                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                    .create();
//
//            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
//            System.out.println(meuTituloOmdb);
//            try {
//                Titulo meuTitulo = new Titulo(meuTituloOmdb);
//                System.out.println(meuTitulo);
//
//                FileWriter salveArquivo = new FileWriter("filmes.txt");
//                salveArquivo.write(meuTitulo.toString());
//                salveArquivo.close();
//
//            } catch (NumberFormatException e) {
//                System.out.println("***ERRO***");
//                System.out.println(e.getMessage());
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println("erro na busca verifique o endereço");
//        }catch (ErroCompilacaoAnoException e){
//            System.out.println(e.getMensage());
//        }
//        System.out.println("encerrando com sucesso");
//    }

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
