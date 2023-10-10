package Exercicios_Logica.Ex01.ex05;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

    /* 5 - Escreva um algoritmo que leia o nome de um aluno
    e as notas das três provas que ele obteve no semestre.
    No finalinformar o nome do aluno e a sua média (aritmética); */


public class ex05 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        String studentName = "";
        float sumOfGrades = 0;
        float media = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.##");
        for (int i = 0; i <= 3; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Digite o nome do aluno: ");
                        studentName = lScanner.nextLine();
                    } else {
                        System.out.print("Digite o valor da nota " + (i) + ": ");
                        float grade = lScanner.nextFloat();
                        sumOfGrades = sumOfGrades + grade;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um valor válido.");
                    lScanner.nextLine();
                }
            }
        }
        media = (sumOfGrades / 3);
        String formatedMedia = toDecimal.format(media);
        System.out.println("A média final do aluno "
                + studentName
                + " é " + formatedMedia
                + ".");
    }
}
