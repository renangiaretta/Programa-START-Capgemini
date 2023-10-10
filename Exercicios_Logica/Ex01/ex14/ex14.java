package Exercicios_Logica.Ex01.ex14;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    14 - Escreva um algoritmo que leia dois valores
    inteiro distintos e informe qual é o maior;
 */

public class ex14 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Digite um número: ");
                        number1 = lScanner.nextInt();
                    } else {
                        System.out.print("Digite outro número: ");
                        number2 = lScanner.nextInt();
                    }
                    if (number2 == number1) {
                        System.out.println("O segundo número" +
                                " não pode ser igual ao primeiro");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um número inteiro.");
                    lScanner.nextLine();
                }
            }
        }
        if (number1 > number2) {
            System.out.println("O número "
                    + number1
                    + " é maior que "
                    + number2 + ".");
        } else {
            System.out.println("O número "
                    + number2
                    + " é maior que "
                    + number1 + ".");
        }
    }
}
