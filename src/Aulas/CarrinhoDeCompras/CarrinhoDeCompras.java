package Aulas.CarrinhoDeCompras;

import java.util.Scanner;

public class CarrinhoDeCompras {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.produtos();
    }

    public void produtos() {
        Scanner entrada = new Scanner(System.in);
        String[] produtos = {"Sal", "Feijão", "Farinha", "Biscoito", "Oleo", "Macarrão", "Arroz", "Açúcar"};
        double[] valor = {10.50, 8.50, 11.50, 1.50, 5.50, 3.50, 4.50, 6.50};
        int[] estoque = {10, 10, 10, 10, 10, 10, 10, 10};
        double valorFinal = 0.0;
        double valorComImposto = 0.0;
        double valorTotalProduto = 0.0;
        int posicao = 0;
        int codigoProduto = 0;

        String[] listaFinal = new String[10];
        int[] qtdeSelecionada = new int[10];
        double[] valorIndividual = new double[10];
        double[] valorTotalPorProduto = new double[10];

        System.out.print("\t\t\t\t Carrinho de Compras Wipro\n=============================================================\n\n");
        System.out.print("CÓDIGO\t\tPRODUTO\t\t\t\tESTOQUE \t\tPREÇO UNIT\n");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("%d\t\t\t%s\t\t\t\t%d\t\t\t\t\t%.2f\n", i + 1, produtos[i], estoque[i], valor[i]);
        }
        System.out.print("\n=============================================================\n");
        boolean loop = true;
        do {
            System.out.print("Código do produto: ");
            codigoProduto = entrada.nextInt() - 1;
            System.out.print("Quantidade desejada: ");

            int quantidadeProduto = entrada.nextInt();
            if (((estoque[codigoProduto] < quantidadeProduto)) || quantidadeProduto == 0) {
                System.out.println("Quantidade indisponivel!!!");
            } else {

                System.out.println(quantidadeProduto + " un. de " + produtos[codigoProduto] + " adicionado" +
                        " com sucesso ao carrinho!!!");
                estoque[codigoProduto] -= quantidadeProduto;

                System.out.print("Deseja continuar comprando? [S/N]");
                String continuarCompra = entrada.next();


                if (continuarCompra.equalsIgnoreCase("N")) {
                    System.out.print("\t\t\t\t ITENS DO CARRINHO\n=============================================================\n\n");
                    System.out.print("PRODUTO\t\t\tQTDE \t\t\tPREÇO UNIT(R$)\t\t\tPREÇO TOTAL\n");
                    for (int i = 0; i < listaFinal.length; i++) {
                        if (listaFinal[i] != null){
                        System.out.printf("%s\t\t\t%d\t\t\t%.2f\t\t\t\t\t%.2f\n", listaFinal[i],
                                qtdeSelecionada[i], valorIndividual[i], valorTotalPorProduto[posicao]);
                        }
                    }
                    valorComImposto = ((0.09 * valorTotalProduto) + valorTotalProduto);
                    System.out.println("Valor total da compra com 9% de imposto: R$" + valorComImposto + "\n");

                    loop = false;
                    System.out.println("Opções de pagamento: \n" +
                            "[1] À vista em dinheiro ou cartão MASTERCARD, recebe 20% de desconto. \n" +
                            "[2] À vista no cartão de credito, recebe 15% de desconto. \n" +
                            "[3] Em duas vezes, preço normal de etiqueta sem juros. \n" +
                            "[4] Em trez vezes, preço normal de etiqueta mais 10% de juros. ");

                    System.out.println("Qual seria a forma de pagamento: ");

                    int formaDePagamento = entrada.nextInt();
                    switch (formaDePagamento) {
                        case 1:
                            valorFinal = valorComImposto - (0.2 * valorComImposto);
                            break;
                        case 2:
                            valorFinal = valorComImposto - (0.15 * valorComImposto);
                            break;
                        case 3:
                            valorFinal = valorComImposto;
                            break;
                        case 4:
                            valorFinal = valorComImposto + (0.1 * valorComImposto);
                            break;
                    }
                }

                valorTotalProduto = valor[codigoProduto] * quantidadeProduto;
                listaFinal[posicao] = produtos[codigoProduto];
                qtdeSelecionada[posicao] = quantidadeProduto;
                valorIndividual[posicao] = valor[codigoProduto];
                valorTotalPorProduto[posicao] = valorComImposto;
                valorFinal += valorComImposto;
                posicao++;


            }
        } while (loop);
        System.out.print("Wipro Store \n" +
                "Rua dos Bootcamps, nº0 - Gama Academy \n" +
                "CNPJ: 1234554321-00");
        System.out.print("\t\t\t\t NOTA FISCAL\n=============================================================\n");
        System.out.print("PRODUTO\t\t\tQTDE \t\t\tPREÇO UNIT(R$)\t\t\tPREÇO TOTAL\n");
        double totalASerPago = 0.0;
        for (int i = 0; i < listaFinal.length; i++) {
            if (listaFinal[i] != null) {
                System.out.printf("%s\t\t\t%d\t\t\t%.2f\t\t\t\t\t%.2f\n", listaFinal[i],
                        qtdeSelecionada[i], valorIndividual[i], valorTotalPorProduto[i]);
                totalASerPago += valorTotalPorProduto[i];
            }
        }
        System.out.print("\n=============================================================\n");

        System.out.printf("DESCONTO NA COMPRA: R$%.2f\n" +
                        "VALOR TRIBUTARIO: R$%.2f\n" +
                        "VALOR TOTAL A SER PAGO: R$%.2f \n\n",
                (totalASerPago - valorFinal),
                (valorComImposto - valorTotalProduto),
                totalASerPago);

    }
}



