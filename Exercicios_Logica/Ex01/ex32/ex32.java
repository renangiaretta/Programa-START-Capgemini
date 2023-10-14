package Exercicios_Logica.Ex01.ex32;

/*
    31 - Escreva um algoritmo que leia três valores inteiros
    e verifique se eles podem ser os lados de um triângulo.
    Se forem, informar qual o tipo de triângulo que eles
    formam: equilátero, isóscele ou escaleno. Propriedade:
    o comprimento de cada lado de um triângulo é menor do que
    a soma dos comprimentos dos
    outros dois lados.
    a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
    c. Triângulo equilátero é também isóscele;
    d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */

import com.thoughtworks.xstream.security.InputManipulationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        while (true) {
            try {
                System.out.print("Digite o tamanho do primeiro lado: ");
                sideA = lScanner.nextDouble();
                System.out.print("Digite o tamanho do segundo lado: ");
                sideB = lScanner.nextDouble();
                System.out.print("Digite o tamanho do terceiro lado: ");
                sideC = lScanner.nextDouble();
                if (sideA > (sideB + sideC)
                        || sideB > (sideA + sideC)
                        || sideC > (sideA + sideB)) {
                    throw new InputMismatchException(
                            "Os valores inseridos não formam um triângulo.");
                } else if (sideA == sideB + sideC
                        || sideB == sideA + sideC
                        || sideC == sideA + sideB) {
                    System.out.println("Os valores fornecidos formam" +
                            " um triângulo degenerado.");
                } else if ((sideA == sideB && sideA != sideC)
                        || (sideA == sideC && sideB != sideA)
                        || (sideB == sideC && sideA != sideB)) {
                    System.out.println("Os valores fornecidos formam" +
                            " um triângulo isóceles");
                } else if (sideA == sideB && sideC == sideA) {
                    System.out.println(
                            "Os valores fornecidos formam um triângulo" +
                                    " isóceles e equilátero.");
                } else {
                    System.out.println("Os valores fornecidos formam" +
                            " um triângulo escaleno.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Insira um valor válido."
                );
                lScanner.nextLine();
            }
        }
    }
}
