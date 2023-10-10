package Exercicios_Logica.Ex01.ex04;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

//    4 - Escreva um algoritmo que leia o nome de um vendedor,
//    o seu salário fixo e o total de vendas efetuadas por ele
//    no mês (em dinheiro). Sabendo que este vendedor ganha 15%
//    de comissão sobre suas vendas efetuadas, informar o seu nome,
//    o salário fixo e salário no final do mês;

public class ex04 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        String sellerName = "";
        float baseSalary = 0;
        float sales = 0;
        double finalSalary = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.##");

        for (int i = 0; i <= 2; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Digite o nome do vendedor: ");
                        sellerName = lScanner.nextLine();
                    } else if (i == 1) {
                        System.out.print("Digite o salário fixo do vendedor em R$: ");
                        baseSalary = lScanner.nextFloat();
                    } else {
                        System.out.print("Digite o montante de vendas do vendedor em R$: ");
                        sales = lScanner.nextFloat();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("O valor informado é inválido.");
                    lScanner.nextLine();
                }
            }
        }
        finalSalary = baseSalary + (0.15 * sales);
        String decimalFinalSalary = toDecimal.format(finalSalary);
        System.out.println("O salário final de "
                + sellerName
                + " neste mês foi de R$ "
                + decimalFinalSalary
                + ".");
    }
}
