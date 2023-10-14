package Exercicios_Logica.Ex01.ex35;

/*
    Faça um algoritmo que calcule o valor da conta de luz
    de uma pessoa. Sabe-se que o cálculo da conta de luz
    segue a tabela abaixo:

    Tipo de Cliente Valor do KW/h
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
 */

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        boolean validChoice = false;
        int clientType = 0;
        double customerConsumption = 0;
        double totalAmount = 0;
        DecimalFormat toDecimal = new DecimalFormat("0.00");

        while (true) {
            try {
                while (!validChoice) {
                    System.out.println("Selecione o tipo de cliente:");
                    System.out.println("1. Residencial");
                    System.out.println("2. Comércio");
                    System.out.println("3. Indústria");
                    System.out.print("Opção: ");
                    int choice = lScanner.nextInt();
                    switch (choice) {
                        case 1:
                            clientType = 1;
                            validChoice = true;
                            break;
                        case 2:
                            clientType = 2;
                            validChoice = true;
                            break;
                        case 3:
                            clientType = 3;
                            validChoice = true;
                            break;
                        default:
                            System.out.println("Selecione uma das opções.");
                    }
                }
                System.out.print("Insira o consumo mensal em KW/h: ");
                customerConsumption = lScanner.nextDouble();
                if (clientType == 1) {
                    totalAmount = customerConsumption * 0.6;
                } else if (clientType == 2) {
                    totalAmount = customerConsumption * 0.48;
                } else {
                    totalAmount = customerConsumption * 1.29;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "O valor inserido é inválido."
                        + "\n");
                lScanner.nextLine();
            }
        }
        String formatedTotalAmount = toDecimal.format(totalAmount);
        System.out.println("O valo a ser pago será de R$ "
                + formatedTotalAmount
                + ".");
    }
}
