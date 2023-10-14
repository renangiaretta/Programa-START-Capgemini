package Exercicios_Logica.Ex01.ex33;

/*
    33 - A escola “APRENDER” faz o pagamento de seus
    professores por hora/aula. Faça um algoritmo que
    calcule e exiba o salário de um professor.
    Sabe-se que o valor da hora/aula segue a tabela abaixo:
    a. Professor Nível 1 R$12,00 por hora/aula;
    b. Professor Nível 2 R$17,00 por hora/aula;
    c. Professor Nível 3 R$25,00 por hora/aula.
 */

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        boolean validRankChoice = false;
        String teacherRank = "";
        int workedHours = 0;
        double monthWage = 0;
        DecimalFormat toDecimal = new DecimalFormat("0.00");
        String teacherName = "";

        while (true) {
            try {
                System.out.print("Insira o nome do professor: ");
                teacherName = lScanner.nextLine();

                if (args.length > 0) {
                    String option = args[0];
                    switch (option) {
                        case "rank1":
                        case "rank2":
                        case "rank3":
                            teacherRank = option;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } else {
                    System.out.println("Escolha uma das opções.");
                }
                while (!validRankChoice) {
                    System.out.println("Selecione o nível do professor:");
                    System.out.println("1 - Nível 1");
                    System.out.println("2 - Nível 2");
                    System.out.println("3 - Nível 3");
                    System.out.print("Opção: ");
                    int choice = lScanner.nextInt();
                    switch (choice) {
                        case 1:
                            teacherRank = "rank1";
                            validRankChoice = true;
                            break;
                        case 2:
                            teacherRank = "rank2";
                            validRankChoice = true;
                            break;
                        case 3:
                            teacherRank = "rank3";
                            validRankChoice = true;
                            break;
                        default:
                            System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
                    }
                }
                System.out.print("Digite quantas horas o professor trabalhou: ");
                workedHours = lScanner.nextInt();
                if (teacherRank.equals("rank1")) {
                    monthWage = workedHours * 12;
                } else if (teacherRank.equals("rank2")) {
                    monthWage = workedHours * 17;
                } else if (teacherRank.equals("rank3")) {
                    monthWage = workedHours * 25;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Os dados inseridos são inválidos.");
            }
        }
        String formatedMonthWage = toDecimal.format(monthWage);
        System.out.println("O salário do professor "
                + teacherName
                + " será de R$ "
                + formatedMonthWage + ".");
    }
}
