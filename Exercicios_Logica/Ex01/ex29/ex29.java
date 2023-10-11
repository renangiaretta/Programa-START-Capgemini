package Exercicios_Logica.Ex01.ex29;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
    29 - . Faça um algoritmo que receba o número do mês
    e mostre o mês correspondente. Valide mês inválido;
 */
public class ex29 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        String[] months = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };
        while (true) {
            try {
                System.out.print("Digite o número do mês: ");
                int monthNumber = lScanner.nextInt();
                if (monthNumber >= 1 && monthNumber <= 12){
                    System.out.println(months[(monthNumber-1)]);
                } else {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número de 1 a 12");
            }
        }


    }
}
