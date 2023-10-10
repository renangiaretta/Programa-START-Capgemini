package Exercicios_Logica.Ex01.ex18;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    18 - Faça um algoritmo que receba a idade de 75
    pessoas e mostre mensagem informando “maior de
    idade” e “menor de idade” para cada pessoa.
    Considere a idade a partir de 18 anos como maior de idade;
 */
public class ex18 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        for (int i = 1; i <= 75; i++) {
            while (true) {
                try {
                    System.out.print(i + "/" + "75 -> " + "Digite a idade da pessoa: ");
                    int age = lScanner.nextInt();
                    if (age >= 0 && age < 18) {
                        System.out.println("Menor de idade.");
                    } else if (age >= 18 && age <= 120) {
                        System.out.println("Maior de idade.");
                    } else {
                        throw new InputMismatchException();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira uma idade válida.");
                    lScanner.nextLine();
                }
            }
        }
    }
}
