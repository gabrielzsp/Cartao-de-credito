package compra;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if(this.saldo > compra.getValorProduto()){
            this.saldo -= compra.getValorProduto();
            this.listaDeCompras.add(compra);
            return true;
        }
            return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
