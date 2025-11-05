package ControleDeCC.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu implements Comparable<Double>{
    Scanner scannerOpc = new Scanner (System.in);
    private int opc;
    private double limite;
    private String descricaoCompra;
    private double valorCompra;

    public void realizarCompra(){
        System.out.println("digite o limite do cartao: ");
        this.limite = scannerOpc.nextDouble();
        do {
            double valorEstabelicido = this.limite;
            System.out.println("digite a descriçao da compra: ");
            this.descricaoCompra = scannerOpc.next();
            System.out.println("digite o valor da compra: ");



            this.valorCompra = scannerOpc.nextDouble();
            decontarValor();
            System.out.println("deseja continuar? 1 para continuar e 2 para sair");
            this.opc = scannerOpc.nextInt();

        }while (this.opc == 1);
        ordenaCompras();

    }

    //analisar como armazenar os numeros passados em uma lista e ordenar essa lista de int



    public void ordenaCompras(){
        List<Double> listaCompras = new ArrayList<>();
        listaCompras.add(valorCompra);
        Collections.sort(listaCompras);
        System.out.println(listaCompras);


    }


    public void decontarValor() {
        if (this.limite >= valorCompra){
            System.out.println( "compra feita com sucesso");
        }else{
            System.out.println( "limite insuficiente");
        }

    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public void setDescricaoCompra(String descricaoCompra) {
        this.descricaoCompra = descricaoCompra;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    @Override
    public int compareTo(Double o) {
        return 0;
    }
}
