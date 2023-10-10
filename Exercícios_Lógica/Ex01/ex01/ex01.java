package Exercícios_Lógica.Ex01.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

public class ex01 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Digite um número: ");
                    } else {
                        System.out.print("Digite mais um número: ");
                    }
                    int insertedNumber = lScanner.nextInt();
                    sum = (sum + insertedNumber);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("O valor inserido não é um número inteiro.");
                    lScanner.nextLine();
                }
            }
        }
        System.out.println("O resultado da soma é: " + sum);
    }
}
