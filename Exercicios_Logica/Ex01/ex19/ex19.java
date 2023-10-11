package Exercicios_Logica.Ex01.ex19;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    19 - Escreva um algoritmo que leia o nome e o sexo
    de 56 pessoas e informe o nome e se ela é homem ou
    mulher. No final informe total de homens e de mulheres;
*/

public class ex19 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int sumOfMales = 0;
        int sumOfFemales = 0;
        for (int i = 1; i <= 3; i++) {
            while (true) {
                try {
                    System.out.print(i + "/" + "56" + " --> Digite o nome: ");
                    String personName = lScanner.nextLine();
                    System.out.print("Informe o genero. M para" +
                            " masculino ou F para feminino: ");
                    String personGender = lScanner.next().toLowerCase();
                    if (!personGender.equals("m") && !personGender.equals("f")) {
                        throw new InputMismatchException("Insira apenas M ou F");
                    }
                    if (personGender.equals("m")) {
                        sumOfMales = sumOfMales + 1;
                        System.out.println(personName + " é homem.");
                    }
                    if (personGender.equals("f")) {
                        sumOfFemales = sumOfFemales + 1;
                        System.out.println(personName + " é mulher.");
                    }
                    lScanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira um dado válido.");
                    lScanner.nextLine();
                }
            }
        }
        System.out.println("Total de homens: " + sumOfMales + ".");
        System.out.println("Total de mulheres: " + sumOfFemales + ".");
    }
}
