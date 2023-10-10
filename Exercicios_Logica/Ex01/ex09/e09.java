package Exercicios_Logica.Ex01.ex09;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
     9 - Faça um algoritmo que receba um valor que
     foi depositado e exiba o valor com rendimento
     após um mês.Considere fixo o juro da poupança
     em 0,07% a. m;
*/
public class e09 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        double montant = 0;
        float capital = 0;
        double interestRate = 0.0007;
        int time = 12;
        DecimalFormat toDecimal = new DecimalFormat("#.00");
        try {
            System.out.print("Digite o valor do depósito: ");
            capital = lScanner.nextFloat();

        } catch (InputMismatchException e) {
            System.out.println("Quantidade inválida.");
            lScanner.nextLine();
        }
        montant = (capital * Math.pow((1+interestRate), time));
        String formatedResult = toDecimal.format(montant);
        System.out.println("O valor total após 1 ano será de R$ " + (formatedResult));
    }
}

