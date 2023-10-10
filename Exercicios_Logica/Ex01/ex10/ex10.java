package Exercicios_Logica.Ex01.ex10;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    10 -A Loja Mamão com Açúcar está vendendo seus
    produtos em 5 (cinco) prestações sem juros.
    Faça um algoritmo que receba um valor de uma
    compra e mostre o valor das prestações;
*/

public class ex10 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float orderAmount = 0;
        float installment = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.00");
        while (true) {
            try {
                System.out.print("Insira o valor da compra: ");
                orderAmount = lScanner.nextFloat();
                if (orderAmount > 0) {
                    break;
                } else {
                    System.out.println("O valor da compra deve ser positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido.");
                lScanner.nextLine();
            }
        }

        installment = (orderAmount / 5);
        String formatedResult = toDecimal.format(installment);
        System.out.println("A compra poderá ser parcelada em 5x de R$ "
                + formatedResult);
    }
}
