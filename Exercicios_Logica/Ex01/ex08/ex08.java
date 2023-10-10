package Exercicios_Logica.Ex01.ex08;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    8 - Elabore um algoritmo que efetue a apresentação
    do valor da conversão em real (R$) de um valor lido
    em dólar (US$). O algoritmo deverá solicitar o valor
    da cotação do dólar e também aquantidade de dólares
    disponíveis com o usuário;
 */
public class ex08 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float dollars = 0;
        float reais = 0;
        float price = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.00");
        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Digite a quantidade de dólares: ");
                        dollars = lScanner.nextFloat();
                    } else {
                        System.out.print("Digite o valor da cotação no dia de hoje: ");
                        price = lScanner.nextFloat();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um número válido.");
                    lScanner.nextLine();
                }
            }
        }
        reais = (dollars * price);
        String formatedResult = toDecimal.format(reais);

        System.out.println("US$"
                + dollars
                + " correspondem a R$"
                + formatedResult + ".");
    }
}
