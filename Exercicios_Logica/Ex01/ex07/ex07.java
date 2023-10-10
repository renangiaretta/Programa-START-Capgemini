package Exercicios_Logica.Ex01.ex07;

import java.util.InputMismatchException;
import java.util.Scanner;

    /*Leia uma temperatura em graus Celsius e apresentá-la
    convertida em graus Fahrenheit. Afórmula de conversão
    é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit
    e C a temperatura emCelsius; */


public class ex07 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float fahrenheit = 0;
        float celsius = 0;
        while (true) {
            try {
                System.out.print("Digite a temperatura em graus Celsius: ");
                celsius = lScanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido");
                lScanner.nextLine();
            }
        }

        fahrenheit = (((9 * celsius) + 160 ) / (5));
        System.out.println("A temperatura de "
                + celsius
                + " °C "
                + "corresponde a "
                + fahrenheit
                + " °F.");
    }
}
