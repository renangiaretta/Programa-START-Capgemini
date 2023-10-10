package Exercicios_Logica.Ex01.ex06;

import java.util.InputMismatchException;
import java.util.Scanner;

    /* 1 - Leia dois valores para as variáveis A e B, e efetuar
    as trocas dos valores de forma que a variávelApasse a
    possuir ovalor da variável B e a variável B passe a possuir
    o valor da variável A.Apresentar osvalores trocados; */


public class ex06 {
    public static void main(String[] arg) {
        Scanner lScanner = new Scanner(System.in);
        int varA = 0;
        int varB = 0;
        int changeVar = 0;
        for (int i=0; i <=1; i++) {
            while(true) {
                try {
                    if (i==0) {
                        System.out.print("Digite um número inteiro para a variável A: ");
                        varA = lScanner.nextInt();
                    } else {
                        System.out.print("Digite um número inteiro para a variável B: ");
                        varB = lScanner.nextInt();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("O valor inserido não é um número inteiro");
                    lScanner.nextLine();
                }
            }
        }
        changeVar = varA;
        varA = varB;
        varB = changeVar;
        System.out.println("Invertendo os valores das variáveis teremos A = "
                + varA
                + " e B = "
                + varB
                + ".");
    }
}
