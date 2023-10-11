package Exercicios_Logica.Ex01.ex20;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    20 - A concessionária de veículos “CARANGO VELHO” está
    vendendo os seus veículos com desconto. Faça um algoritmo
    que calcule e exiba o valor do desconto e o valor a ser
    pago pelo cliente de vários carros. O desconto deverá ser
    calculado de acordo com o ano do veículo. Até 2000 - 12%
    e acima de 2000 - 7%. O sistema deverá perguntar se deseja
    continuar calculando desconto até que a resposta seja:
    “(N) Não”. Informar total de carros com ano até 2000 e
    total geral;
 */

public class ex20 {
    public static void main(String[] args){
        Scanner lScanner = new Scanner(System.in);
        int sumBefore2000 = 0;
        int sumAfter2000 = 0;
        double finalPrice = 0;
        double totalDiscount = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.00");
        LocalDate atualDate = LocalDate.now();
        int atualYear = atualDate.getYear();

        while (true) {
            try {
                System.out.print("Informe o valor do veículo em reais: ");
                float price = lScanner.nextFloat();
                System.out.print("Informe o ano do veículo: ");
                int year = lScanner.nextInt();
                lScanner.nextLine();
                if (year <= 2000) {
                    totalDiscount = (price * 0.12);
                    sumBefore2000 = (sumBefore2000 + 1);
                } else if (year > atualYear ) {
                    throw new InputMismatchException("Ano inválido.");
                } else {
                    totalDiscount = (price * 0.07);
                    sumAfter2000 = (sumAfter2000 + 1);
                }
                finalPrice = (price - totalDiscount);
                String formatedDiscount = toDecimal.format(totalDiscount);
                String formatedFinalPrice = toDecimal.format(finalPrice);
                System.out.println("O valor do desconto é de R$ "
                        + formatedDiscount
                        + " e o valor a ser pago será R$ "
                        + formatedFinalPrice
                        + ".");
                System.out.print("Deseja continuar (S/N)? ");
                String keepGoing = lScanner.nextLine().toLowerCase();
                if (keepGoing.equals("n")) {
                    System.out.println("Total de carros até o ano 2000: "
                            + ((sumBefore2000 > 0) ? sumBefore2000 : "nenhum") + "." + " Total de carros: "
                            + (sumAfter2000
                            + sumBefore2000));
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                lScanner.nextLine();
            }
        }
    }
}
