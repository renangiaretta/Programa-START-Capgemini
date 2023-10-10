package Exercicios_Logica.Ex01.ex11;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
     11 - Faça um algoritmo que receba o preço
     de custo de um produto e mostre o valor de
     venda. Sabe-se que o preço de custo receberá
     um acréscimo de acordo com um percentual
     informado pelo usuário;
*/


public class ex11 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float productPrice = 0;
        float percentage = 0;
        float sellPrice = 0;
        String formatedResult = "0";
        DecimalFormat toDecimal = new DecimalFormat("#.00");
        while (true) {
            try {
                System.out.print("Digite o preço de custo do produto: ");
                productPrice = lScanner.nextFloat();
                if (productPrice < 0) {
                    System.out.println("O valor de custo deve ser positivo.");
                } else {
                    System.out.print("Digite a margem de lucro em %: ");
                    percentage = lScanner.nextFloat();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido.");
                lScanner.nextLine();
            }
        }
        sellPrice = ((productPrice) + (productPrice * (percentage / 100)));
        formatedResult = toDecimal.format(sellPrice);
        System.out.println("O valor de venda deverá ser R$ "
                + formatedResult
                + ".");
    }
}
