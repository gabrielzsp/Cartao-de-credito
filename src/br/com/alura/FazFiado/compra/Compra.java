package br.com.alura.FazFiado.compra;

public class Compra implements Comparable<Compra>{
    private String nomeProduto;
    private double valorProduto;

    public Compra(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return "Compra: " +
               "Descricao = " + nomeProduto +
               "Valor = " + valorProduto;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(outraCompra.valorProduto));
    }
}
