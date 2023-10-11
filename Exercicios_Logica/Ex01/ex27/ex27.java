package Exercicios_Logica.Ex01.ex27;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*

 */

public class ex27 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        double discountOnVechile = 0;
        double totalAmount = 0;
        double totalDiscount = 0;
        double totalPayd = 0;
        String vechileFuel = "";
        boolean validFuelChoice = false;
        boolean closeProgram = false;
        DecimalFormat toDecimal = new DecimalFormat("#.00");
        int soldVechiles = 0;

        while (true) {
            validFuelChoice = false;
            try {
                System.out.print("Digite o valor do veículo " + (soldVechiles + 1) + ": ");
                float vechilePrice = lScanner.nextFloat();
                if (vechilePrice < 0) {
                    throw new InputMismatchException("O valor deve ser positivo.");
                } else if (vechilePrice == 0) {
                    String formatedTotalAmount = toDecimal.format(totalAmount);
                    String formatedTotalPayd = toDecimal.format(totalPayd);
                    String formatedTotalDiscount = toDecimal.format(totalDiscount);


                    System.out.print("\n");
                    if ((soldVechiles > 1)) {
                        System.out.println("Foram vendidos "
                                + soldVechiles
                                + " veículos hoje.");
                    } else {
                        System.out.println("Foi vendido "
                                + soldVechiles
                                + " veículo hoje.");
                    }
                    System.out.println("O valor total de vendas foi de R$ "
                            + formatedTotalAmount
                            + ".");
                    System.out.println("O valor total de pago foi de R$ "
                            + formatedTotalPayd
                            + ".");
                    System.out.println("O valor total de desconto foi de R$ "
                            + formatedTotalDiscount
                            + ".");
                    validFuelChoice = true;
                    break;
                }
                if (args.length > 0) {
                    String option = args[0];
                    switch (option) {
                        case "Álcool":
                        case "Gasolina":
                        case "Diesel":
                            vechileFuel = option;
                            validFuelChoice = true;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                } else {
                    System.out.println("Nenhuma opção fornecida.");
                }

                while (!validFuelChoice) {
                    System.out.println("Escolha o tipo de combustível:");
                    System.out.println("1. Álcool");
                    System.out.println("2. Gasolina");
                    System.out.println("3. Diesel");
                    System.out.print("Opção: ");

                    int choice = lScanner.nextInt();

                    switch (choice) {
                        case 1:
                            vechileFuel = "Álcool";
                            validFuelChoice = true;
                            soldVechiles = (soldVechiles + 1);
                            break;
                        case 2:
                            vechileFuel = "Gasolina";
                            validFuelChoice = true;
                            soldVechiles = (soldVechiles + 1);
                            break;
                        case 3:
                            vechileFuel = "Diesel";
                            validFuelChoice = true;
                            soldVechiles = (soldVechiles + 1);
                            break;
                        default:
                            System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
                    }
                }
                if (vechileFuel.equals("Álcool")) {
                    discountOnVechile = (vechilePrice * 0.25);
                } else if (vechileFuel.equals("Gasolina")) {
                    discountOnVechile = (vechilePrice * 0.21);
                } else {
                    discountOnVechile = (vechilePrice * 0.14);
                }
                double priceWithDiscount = vechilePrice - discountOnVechile;
                String formatedDiscountOnVechile = toDecimal.format(discountOnVechile);
                String formatedpriceWithDiscount = toDecimal.format(priceWithDiscount);
                System.out.println("O valor do desconto é de R$  "
                        + formatedDiscountOnVechile);
                System.out.println("O valor a ser pago é de R$  "
                        + formatedpriceWithDiscount);
                totalAmount = totalAmount + vechilePrice;
                totalDiscount = totalDiscount + discountOnVechile;
                totalPayd = totalPayd + priceWithDiscount;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "O valor inserido é inválido"
                );
                lScanner.nextLine();
            }
        }
    }
}
