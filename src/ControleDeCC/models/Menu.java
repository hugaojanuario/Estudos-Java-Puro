package ControleDeCC.models;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    Scanner entradaDados = new Scanner(System.in);
    public void menu(){
        System.out.println("Informe o limite do seu cc: ");
        double limite = entradaDados.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while(sair != 0){
            System.out.println("Digite a descricao da compra: ");
            String descricao = entradaDados.next();

            System.out.println("Digite o valor da compra: ");
            double valorCompra = entradaDados.nextDouble();

            Compra compra = new Compra(descricao, valorCompra);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("compra realizada com sucesso");
                System.out.println("digite 0 para sair e 1 para continuar: ");
                sair = entradaDados.nextInt();
            }else {
                System.out.println("saldo insuficiente");
                sair = 0;
            }

            System.out.println("===============");
            System.out.println("Compras Realizadas\n");
            Collections.sort(cartao.getListaCompras());
            for (Compra c : cartao.getListaCompras()){
                System.out.println(c.getDescricao() + " - " + c.getValorCompra());
            }
            System.out.println("\n==============");
            System.out.println("\n Saldo do cartao: "+ cartao.getSaldo());
        }


    }

}
