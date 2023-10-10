package Exercicios_Logica.Ex01.ex12;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    12 - O custo de um carro novo ao consumidor é a soma
    do custo de fábrica mais o percentual do distribuidor
    e dos impostos aplicados (primeiro os impostos são
    aplicados sobre o custo de fábrica, e depois o percentual
    do distribuidor sobre o resultado). Supondo que o
    percentual do distribuidor seja de 28% e os impostos
    45%, escreva um algoritmo que leia o custo de fábrica
    de um carro e informe o custo ao consumidor do mesmo;
*/
public class ex12 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        float productPrice = 0;
        double sellerRate = 0.28;
        double costToSeller = 0;
        double tax = 0.45;
        double finalPrice = 0;
        DecimalFormat toDecimal = new DecimalFormat("#.00");

        while(true) {
            try {
                System.out.println("Digite o valor de custo do veículo: ");
                productPrice = lScanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido.");
                lScanner.nextLine();
            }
        }
        costToSeller = (productPrice + (productPrice * tax));
        finalPrice = costToSeller + (costToSeller * sellerRate);
        String formatedResult = toDecimal.format(finalPrice);
        System.out.println("O preço de venda ao consumidor será R$ "
                + formatedResult
                + ".");
    }
}
