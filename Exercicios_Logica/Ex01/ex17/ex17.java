package Exercicios_Logica.Ex01.ex17;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    17 - Leia 80 números e ao final informar quantos
    número(s) est(á)ão no intervalo entre 10 (inclusive)
    e 150 (inclusive);
 */
public class ex17 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int quantityOnInterval = 0;

        for (int i = 0; i <= 4; i++) {
            while (true) {
                try {
                    System.out.print("Digite um número: ");
                    int insertedNumber = lScanner.nextInt();
                    if (insertedNumber >= 10 && insertedNumber <= 150) {
                        quantityOnInterval = quantityOnInterval + 1;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um número inteiro válido");
                    lScanner.nextLine();
                }
            }
        }
        System.out.println(quantityOnInterval
                + " números pertencem ao intervalo entre 10 e 150.");
    }
}
