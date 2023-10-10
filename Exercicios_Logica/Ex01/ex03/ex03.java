package Exercicios_Logica.Ex01.ex03;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


//    1 - Escreva um algoritmo para determinar o consumo médio
//    de um automóvel sendo fornecida a distância total
//    percorrida pelo automóvel e o total de combustível gasto;
public class ex03 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float kms = 0;
        float liters = 0;
        DecimalFormat formatResult = new DecimalFormat("#.##");
        for (int i = 0; i <= 1; i++) {
            while (true) {
                try {
                    if (i == 0) {
                        System.out.print("Digite a distância percorrida em Km: ");
                        kms = lScanner.nextFloat();
                    } else {
                        System.out.print("Digite a quantidade em Litros" +
                                " de combustível gasto no percurso: ");
                        liters = lScanner.nextFloat();
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("O valor digitado não é um número válido");
                    lScanner.nextLine();
                }
            }
        }
        float averageConsumption = (kms / liters);
        String result = formatResult.format(averageConsumption);
        System.out.println("O consumo médio neste trajeto foi de "
                + result
                + " km/L");
    }
}
