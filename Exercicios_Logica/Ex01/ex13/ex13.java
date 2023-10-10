package Exercicios_Logica.Ex01.ex13;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    13 - Faça um algoritmo que receba um número
    e mostre uma mensagem caso este número
    seja maior que 10;
 */
public class ex13 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float insertedNumber = 0;

        while (true) {
            try {
                System.out.print("Digite um número: ");
                insertedNumber = lScanner.nextFloat();
                if (insertedNumber > 10 ) {
                    System.out.println("O número inserido é maior que 10.");
                } else {
                    System.out.println("O número inserido não é maior que 10.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido");
                lScanner.nextLine();
            }
        }
    }
}
