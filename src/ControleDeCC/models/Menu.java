package ControleDeCC.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Comparable<Menu>{
    Scanner scannerOpc = new Scanner (System.in);
    private int opc;
    private double limite;
    private String descricaoCompra;
    private double valorCompra;

    public void realizarCompra(){
        do {
            System.out.println("digite o limite do cartao: ");
            this.limite = scannerOpc.nextDouble();
            System.out.println("digite a descriçao da compra: ");
            this.descricaoCompra = scannerOpc.next();
            System.out.println("digite o valor da compra: ");
            this.valorCompra = scannerOpc.nextDouble();
            decontarValor();
            System.out.println("deseja continuar? 1 para continuar e 2 para sair");
            this.opc = scannerOpc.nextInt();

        }while (this.opc == 1);


    }

    //analisar como armazenar os numeros passados em uma lista e ordenar essa lista de int


    @Override
    public int compareTo(Menu compras) {
        return this.valorCompra.compareTo(compras.valorCompra);
    }

    public void ordenaCompras(){
        ArrayList<Menu> listaCompras = new ArrayList<>();
        listaCompras.add(this.valorCompra);


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



}
