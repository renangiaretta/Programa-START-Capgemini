package Exercicios_Logica.Ex01.ex16;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    16 - Escreva um algoritmo que leia o nome e as
    três notas obtidas por um aluno durante o semestre.
    Calcular a sua média (aritmética), informar o nome
    e sua menção aprovado (media >= 7), Reprovado
    (media <= 5) e Recuperação (media entre 5.1 a 6.9);
 */

public class ex16 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        String studentName = "";
        double sumOfGrades = 0;
        double media = 0;

        for (int i = 0; i <= 3; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Insira o nome do aluno: ");
                        studentName = lScanner.nextLine();
                    } else {
                        System.out.print("Insira o valor da nota " + i + ": ");
                        double grade = lScanner.nextFloat();
                        if (grade < 0 || grade > 10) {
                            throw new InputMismatchException();
                        }
                        sumOfGrades = sumOfGrades + grade;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um valor entre 0 e 10.");
                    lScanner.nextLine();
                }
            }
        }
        media = sumOfGrades / 3;
        if (media < 5) {
            System.out.println("O aluno "
                    + studentName
                    + " está reprovado com média "
                    + media + ".");
        } else if (media >= 5 && media < 7) {
            System.out.println("O aluno "
                    + studentName
                    + " está em recuperação com média "
                    + media + ".");
        } else {
            System.out.println("O aluno "
                    + studentName
                    + " está aprovado com média "
                    + media + ".");
        }
    }
}
