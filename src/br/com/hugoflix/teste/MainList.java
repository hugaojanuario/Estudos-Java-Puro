package br.com.hugoflix.teste;

import br.com.hugoflix.dominio.Filme;
import br.com.hugoflix.dominio.Serie;
import br.com.hugoflix.dominio.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        Filme hugo = new Filme("tartaruga ninja", 2007, "Tio Le");
        hugo.avalia(10);
        Filme rita = new Filme("narnia", 2000, "bahia films");
        rita.avalia(7);
        Serie soso = new Serie("greys anatomy", 2010, 12 ,34, "A volta dos que nao foram");

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(hugo);
        listaTitulos.add(rita);
        listaTitulos.add(soso);
        for(Titulo item : listaTitulos){
            System.out.println(item);
            if (item instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }

        }

        List<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Hugao");
        buscaPorArtistas.add("Ritinha");
        buscaPorArtistas.add("Ambrozio");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de titulos ordenada: ");
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

    }

}
