package Exercicios_Logica.Ex01.ex34;

/*
    4. Elabore um algoritmo que, dada a idade de um nadador.
    Classifique-o em uma das seguintes categorias:
    a. Infantil A = 5 - 7 anos;
    b. Infantil B = 8 - 10 anos;
    c. Juvenil A = 11- 13 anos;
    d. Juvenil B = 14 - 17 anos;
    e. Sênior = 18 - 25 anos.
    Apresentar mensagem “idade fora da faixa etária”
    quando for outro ano não contemplado;
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int swimmerAge = 0;

        while (true) {
            try {
                System.out.print("Digite a idade do nadador: ");
                swimmerAge = lScanner.nextInt();
                if (swimmerAge >= 5 && swimmerAge <= 7) {
                    System.out.println("O nadador está na categoria Infantil A.");
                } else if (swimmerAge >= 8 && swimmerAge <= 10) {
                    System.out.println("O nadador está na categoria Infantil B.");
                } else if (swimmerAge >= 11 && swimmerAge <= 13) {
                    System.out.println("O nadador está na categoria Juvenil A.");
                } else if (swimmerAge >= 14 && swimmerAge <= 17) {
                    System.out.println("O nadador está na categoria Juvenil B.");
                } else if (swimmerAge >= 18 && swimmerAge <= 25) {
                    System.out.println("O nadador está na categoria Sênior.");
                } else {
                    System.out.println("Idade fora da faixa etária.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "O valor inserido é inválido.");
                lScanner.nextLine();
            }
        }
    }
}
