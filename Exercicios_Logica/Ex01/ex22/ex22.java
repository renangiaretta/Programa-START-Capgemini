package Exercicios_Logica.Ex01.ex22;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    22 - Faça um algoritmo que receba o preço de custo
    e o preço de venda de 40 produtos. Mostre como resultado
    se houve lucro, prejuízo ou empate para cada produto.
    Informe o valor de custo de cada produto, o valor de venda
    de cada produto, amédia de preço de custo e do preço de venda;
*/

class Product {
    String name;
    double costPrice;
    double sellPrice;
    String status;

    public Product(String name, double costPrice, double sellPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public void calculateStatus() {
        if (sellPrice > costPrice) {
            status = "Lucro";
        } else if (sellPrice < costPrice) {
            status = "Prejuízo";
        } else {
            status = "Empate";
        }
    }
}

public class ex22 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        Product[] products = new Product[2];
        double totalCost = 0;
        double totalSell = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.00");

        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    System.out.print("Digite o nome do produto " + (i+1) + ": ");
                    String name = lScanner.nextLine();
                    System.out.print("Digite o preço de custo: ");
                    double costPrice = lScanner.nextDouble();
                    if (costPrice < 0) {
                        throw new InputMismatchException("O custo não pode ser negativo.");
                    }
                    System.out.print("Digite o preço de venda: ");
                    double sellPrice = lScanner.nextDouble();
                    if (sellPrice < 0) {
                        throw new InputMismatchException("O preço de venda não" +
                                " pode ser negativo.");
                    }
                    lScanner.nextLine();

                    products[i] = new Product(name, costPrice, sellPrice);
                    products[i].calculateStatus();
                    System.out.println(products[i].status);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(
                            e.getMessage() != null
                                    ? e.getMessage()
                                    : "Insira um valor válido");
                    lScanner.nextLine();
                }
            }
        }
        for (int i = 0; i <= 1; i++) {
            System.out.println(
                    products[0].name
                            + " custou R$ "
                            + products[i].costPrice
                            + " e foi vendido por R$ "
                            + products[i].sellPrice
                            + ". O resultado foi: "
                            + products[i].status
                            + "."
            );
            totalCost = totalCost + products[i].costPrice;
            totalSell = totalSell + products[i].sellPrice;
        }
        double averageCost = totalCost / 2;
        String formatedAverageCost = toDecimal.format(averageCost);
        double averageSell = totalSell / 2;
        String formatedAverageSell = toDecimal.format(averageSell);
        System.out.println("O preço de custo médio foi de R$ " + formatedAverageCost + ".");
        System.out.println("O preço de venda médio foi de R$ " + formatedAverageSell + ".");
    }
}
