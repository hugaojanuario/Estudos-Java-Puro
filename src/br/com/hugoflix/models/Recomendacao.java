package br.com.hugoflix.models;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("esta no top 1");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("esta no top 2");
        }else{
            System.out.println("esta no top 0");
        }
    }


}
