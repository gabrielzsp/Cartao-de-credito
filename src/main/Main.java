package main;

import compra.CartaoCredito;
import compra.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o limite do cartao: ");
        double limite = leitor.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = leitor.next();

            System.out.println("Digite o valor do produto: ");
            double valorProduto = leitor.nextDouble();

            Compra compra = new Compra(nomeProduto, valorProduto);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitor.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("**************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getListaDeCompras());
        for (Compra c : cartao.getListaDeCompras()) {
            System.out.println(c.getNomeProduto() + " - " + c.getValorProduto());
        }
        System.out.println("\n********************************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());

    }
}

















