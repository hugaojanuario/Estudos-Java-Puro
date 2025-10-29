package br.com.hugoflix.calculos;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("esta no top 10");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("esta no top 20");
        }else{
            System.out.println("esta no top 100");
        }
    }


}
