package Exercicios_Logica.Ex01.ex26;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    26 - Faça um algoritmo que leia um número de 1 a 5
    e escreva por extenso. Caso o usuário digite um número
    que não esteja neste intervalo, exibir a seguinte
    mensagem: número inválido;
 */
public class ex26 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        String[] numberWords = {"Um", "Dois", "Três", "Quatro", "Cinco"};
        while (true) {
            try {
                System.out.print("Digite um número: ");
                int insertedNumber = lScanner.nextInt();
                if (insertedNumber < 1 || insertedNumber > 5) {
                    throw new InputMismatchException("Número inválido.");
                }
                System.out.println(numberWords[(insertedNumber - 1)]);
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() != null
                        ? e.getMessage()
                        : "Número inválido");
                lScanner.nextLine();
            }
            break;
        }
    }
}
