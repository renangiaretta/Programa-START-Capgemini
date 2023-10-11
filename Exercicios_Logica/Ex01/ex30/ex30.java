package Exercicios_Logica.Ex01.ex30;

/*
    30 - Escreva um algoritmo que leia três valores inteiros
    distintos e os escreva em ordem crescente;
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int[] numberList = new int[3];

        for (int i = 0; i < numberList.length; i++) {
            while (true) {
                try {
                    System.out.print("Digite um número: ");
                    int insertedNumber = lScanner.nextInt();
                    numberList[i] = insertedNumber;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um número inteiro.");
                    lScanner.nextLine();
                }
            }
        }
        Arrays.sort(numberList);
        System.out.println("Os números digitados em ordem crescente são: "
                + numberList[0]
                + ", "
                + numberList[1]
                + " e "
                + numberList[2]
        );
    }
}
