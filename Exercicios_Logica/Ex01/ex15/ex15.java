package Exercicios_Logica.Ex01.ex15;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    15 - Faça um algoritmo que receba um número
    e diga se este número está no intervalo
    entre 100 e 200;
 */

public class ex15 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float insertedNumber = 0;

        while (true) {
            try {
                System.out.print("Digite um número: ");
                insertedNumber = lScanner.nextFloat();
                if (insertedNumber >= 100 && insertedNumber <= 200) {
                    System.out.println("O número "
                            + insertedNumber
                            + " pertence ao intervalo entre 100 e 200");
                } else {
                    System.out.println("O número "
                            + insertedNumber
                            + " não pertence ao intervalo entre 100 e 200");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                lScanner.nextLine();
            }
        }
    }
}
