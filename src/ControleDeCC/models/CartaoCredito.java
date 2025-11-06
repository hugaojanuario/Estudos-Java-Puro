package ControleDeCC.models;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    List<Compra> listaCompras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getValorCompra()){
            this.saldo -= compra.getValorCompra();
            this.listaCompras.add(compra);
            return true;
        }else{
            return false;
        }
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}
