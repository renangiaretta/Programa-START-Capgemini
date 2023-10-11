package Exercicios_Logica.Ex01.ex23;

/*
    23 - Faça um algoritmo que receba um número e mostre
    uma mensagem caso este número sege maior que 80,
    menor que 25 ou igual a 40.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            int insertedNumber = lScanner.nextInt();
            if (insertedNumber < 25) {
                System.out.println("O número é menor que 25");
            }
            else if (insertedNumber == 40) {
                System.out.println("O número é igual a 40.");
            }
            else if (insertedNumber > 80) {
                System.out.println("O número é maior que 80.");
            } else {
                System.out.println("Não há uma instrução específica para este número.");
            }
        } catch (InputMismatchException e) {
            System.out.println((e.getMessage() != null)
                    ? e.getMessage()
                    : "Insira um número válido.");
        }
    }
}
