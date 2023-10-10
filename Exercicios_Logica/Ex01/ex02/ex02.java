package Exercicios_Logica.Ex01.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

// 2 - Faça um algoritmo que receba dois números e ao
// final mostre a soma, subtração, multiplicação e a divisão
// dos dois números lidos;

public class ex02 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);

        float sum = 0;
        float subtraction = 0;
        float multiplication = 1;
        float division = 0;
        boolean possibleDivision = false;

        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    System.out.print("Digite um número: ");
                    float insertedNumber = lScanner.nextFloat();
                    sum = sum + insertedNumber;
                    subtraction = (i == 0)
                            ? insertedNumber
                            : (subtraction - insertedNumber);
                    multiplication = (multiplication * insertedNumber);
                    division = (i == 0) ? insertedNumber : division;
                    if (i == 1 && insertedNumber != 0) {
                        division = division / insertedNumber;
                        possibleDivision = true;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("O valor inserido não é um número válido.");
                    lScanner.nextLine();
                }
            }
        }
        System.out.println("O resultado da soma é: " + sum);
        System.out.println("O resultado da subtração é: " + subtraction);
        System.out.println("O resultado da multiplicação é: " + multiplication);
        if (possibleDivision) {
            System.out.println("O resultado da divisão é: " + division);
        } else {
            System.out.println("Não é possível dividir por 0.");
        }
    }
}
