package Exercicios_Logica.Ex01.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    21 - Escreva um algoritmo que leia os dados de
    “N” pessoas (nome, sexo, idade e saúde) e informe
    se está apta ou não para cumprir o serviço militar
    obrigatório. Informe os totais;
 */
public class ex21 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        int quantityOfPersons = 0;
        int sumOfAbles = 0;
        int sumOfUnables = 0;
        String personName = "";
        String gender = "";
        int age = 0;
        String healthy = "";

        try {
            System.out.print("Digite a quantidade de candidatos: ");
            quantityOfPersons = lScanner.nextInt();
            lScanner.nextLine();
            if (quantityOfPersons < 1) {
                throw new InputMismatchException("Insira uma quantidade válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 1; i <= quantityOfPersons; i++) {
            while (true) {
                try {
                    System.out.print(
                            i
                                    + "/"
                                    + quantityOfPersons
                                    + " --> "
                                    + "Digite o nome da pessoa: ");
                    personName = lScanner.nextLine();
                    System.out.print("Digite o gênero da pessoa (M/F): ");
                    gender = lScanner.next().toLowerCase();
                    if (!gender.equals("m") && !gender.equals("f")) {
                        throw new InputMismatchException("Gênero inválido.");
                    }
                    System.out.print("Digite a idade: ");
                    age = lScanner.nextInt();
                    if (age < 0) {
                        throw new InputMismatchException("Idade inválida.");
                    }
                    System.out.print("A pessoa está saudável (S/N)? ");
                    healthy = lScanner.next().toLowerCase();
                    if (!healthy.equals("s") && !healthy.equals("n")) {
                        throw new InputMismatchException("Valor inválido.");
                    }
                    if (gender.equals("m") && age == 18 && healthy.equals("s")) {
                        System.out.println(personName
                                + " está apto a prestar serviço militar.");
                        lScanner.nextLine();
                        sumOfAbles = sumOfAbles + 1;
                    } else {
                        sumOfUnables = sumOfUnables + 1;
                        System.out.println(personName
                                + " não pode prestar serviço militar.");
                        lScanner.nextLine();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println((e.getMessage() != null)
                            ? e.getMessage()
                            : "Valor inválido.");
                    lScanner.nextLine();
                }
            }
        }
        System.out.println("Total de pessoas aptas a prestar seviço militar: "
                + sumOfAbles
                + ".");
        System.out.println("Total de pessoas inaptas a prestar seviço militar: "
                + sumOfUnables
                + ".");
    }
}
