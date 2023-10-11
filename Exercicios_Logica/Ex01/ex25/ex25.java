package Exercicios_Logica.Ex01.ex25;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Faça um algoritmo que leia dois números e identifique
    se são iguais ou diferentes. Caso eles sejam iguais
    imprima uma mensagem dizendo que eles são iguais.
    Caso sejam diferentes, informe qual número é o maior,
    e uma mensagem que são diferentes;
 */

public class ex25 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float firstNumber = 0;
        float secondNumber = 0;


        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    System.out.print("Digite o primeiro número: ");
                    firstNumber = lScanner.nextFloat();
                    lScanner.nextLine();
                    System.out.print("Digite o segundo número: ");
                    secondNumber = lScanner.nextFloat();
                    lScanner.nextLine();
                    if (firstNumber == secondNumber) {
                        System.out.println("Os números são iguais");
                        break;
                    } else {
                        System.out.println("Os números são diferentes.");
                        if (firstNumber > secondNumber) {
                            System.out.println("O primeiro número informado" +
                                    " é maior que o segundo.");
                        } else {
                            System.out.println("O segundo número informado" +
                                    " é maior que o primeiro.");
                        }
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um valor válido.");
                    lScanner.nextLine();
                }
            }
        }
    }
}
