package Exercicios_Logica.Ex01.ex24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int quantityOfNumbers = 0;

        System.out.print("Quantos números deseja verificar? ");
        quantityOfNumbers = lScanner.nextInt();


        for (int i = 1; i <= quantityOfNumbers; i++) {
            while (true) {
                try {
                    System.out.print(i + "/" + quantityOfNumbers + " --> Digite um número: ");
                    float insertedNumber = lScanner.nextFloat();
                    if (insertedNumber < 0) {
                        System.out.println("Negativo!");
                        lScanner.nextLine();
                    } else if (insertedNumber == 0) {
                        System.out.println("Zero!");
                        lScanner.nextLine();
                    } else {
                        System.out.println("Positivo!");
                        lScanner.nextLine();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um número válido");
                    lScanner.nextLine();
                }
            }
        }
    }
}
