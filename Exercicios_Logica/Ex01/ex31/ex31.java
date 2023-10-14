package Exercicios_Logica.Ex01.ex31;

/*
    31 - Dados três valores A, B e C, em que A e B são números
    reais e C é um caractere, pede-se para imprimir o
    resultado da operação de A por B se C for um símbolo
    de operador aritmético; caso contrário deve ser
    impressa uma mensagem de operador não definido.
    Tratar erro de divisão por zero;
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        double varA = 0;
        double varB = 0;
        String varC = "";
        double result = 0;

        while (true) {
            try {
                System.out.print("Digite um número: ");
                varA = lScanner.nextDouble();
                System.out.print("Digite mais um número: ");
                varB = lScanner.nextDouble();
                lScanner.nextLine();
                System.out.print("Digite um operador aritmético: ");
                varC = lScanner.nextLine();

                if (varC.equals("+")) {
                    result = varA + varB;
                } else if (varC.equals("-")) {
                    result = varA - varB;
                } else if (varC.equals("*")) {
                    result = varA * varB;
                } else if (varC.equals("/") && varB == 0) {
                    throw new InputMismatchException("Não é possível dividir por 0.");
                } else if (varC.equals("/")) {
                    result = varA / varB;
                } else {
                    throw new InputMismatchException("Insira apenas valores válidos.");
                }
                System.out.println("Resultado da  operação: "
                        + varA
                        + " "
                        + varC
                        + " "
                        + varB
                        + " = "
                        + result);
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Verifique os dados inseridos e tente novamente.");
                break;
            }
        }
    }
}
