package Exercicios_Logica.Ex01.ex28;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 28 - Escreva um algoritmo para uma empresa que decide dar um
    reajuste a seus 584 funcionários de acordo com os seguintes critérios:

    a. 50% para aqueles que ganham menos do que três salários mínimos;
    b. 20% para aqueles que ganham entre três até dez salários mínimos;
    c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    d. 10% para os demais funcionários.

    Leia o nome do funcionário, seu salário e o valor do salário mínimo.
    Calcule o seu novo salário reajustado. Escrever o nome do funcionário,
    o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar
    sua folha de pagamento;
 */

public class ex28 {
    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        double minimumSalary = 0;
        double oldPayroll = 0;
        double newPayroll = 0;
        double payrollDifference = 0;
        DecimalFormat toDecimal = new DecimalFormat("0.00");

        while (true) {
            try {
                System.out.print("Insira o valor do salário mínimo: ");
                minimumSalary = lScanner.nextFloat();
                lScanner.nextLine();
                if (minimumSalary <= 0) {
                    throw new InputMismatchException("O valor deve ser positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println((e.getMessage() != null)
                        ? e.getMessage()
                        : "Insira um valor válido");
                lScanner.nextLine();
            }
        }
        for (int i = 0; i <= 2; i++) {
            while (true) {
                try {
                    double salaryRaise = 0;
                    double newSalary = 0;
                    System.out.print((i + 1) + " - Digite o nome do funcionário: ");
                    String employeeName = lScanner.nextLine();
                    System.out.print("Digite o salário de " + employeeName + ": ");
                    double employeeSalary = lScanner.nextDouble();
                    lScanner.nextLine();
                    if (employeeSalary < minimumSalary) {
                        throw new InputMismatchException(
                                "O salário do funcionário não pode ser menor" +
                                        " do que o salário mínimo");
                    } else if (employeeSalary < (3 * minimumSalary)) {
                        salaryRaise = (employeeSalary * 0.5);
                        newSalary = (employeeSalary + salaryRaise);
                    } else if (employeeSalary < (10 * minimumSalary)
                            && employeeSalary >= (3 * minimumSalary)) {
                        salaryRaise = (employeeSalary * 0.2);
                        newSalary = (employeeSalary + salaryRaise);
                    } else if (employeeSalary <= (20 * minimumSalary)
                            && employeeSalary > (10 * minimumSalary)) {
                        salaryRaise = (employeeSalary * 0.15);
                        newSalary = (employeeSalary + salaryRaise);
                    } else {
                        salaryRaise = (employeeSalary * 0.1);
                        newSalary = (employeeSalary + salaryRaise);
                    }
                    String formatedSalaryRaise = toDecimal.format(salaryRaise);
                    String formatedNewSalary = toDecimal.format(newSalary);
                    System.out.println(
                            employeeName +
                                    " terá um aumento de R$ "
                                    + formatedSalaryRaise
                                    + " e seu novo salário será de R$ "
                                    + formatedNewSalary
                    );
                    oldPayroll = oldPayroll + employeeSalary;
                    newPayroll = newPayroll + newSalary;
                    payrollDifference = newPayroll - oldPayroll;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println((e.getMessage() != null)
                            ? e.getMessage()
                            : "Insira um valor válido");
                    lScanner.nextLine();
                }
            }
        }
        String formatedOldPayroll = toDecimal.format(oldPayroll);
        String formatedNewPayroll = toDecimal.format(newPayroll);
        String formatedPayrollDifference = toDecimal.format(payrollDifference);

        System.out.println(
                "\n"
                        + "------------------------------------------------------------"
                        + "\n"
                        + "A empresa tinha uma folha de pagamento de R$ "
                        + formatedOldPayroll
                        + " e agora terá um aumento de R$ "
                        + formatedPayrollDifference
                        + "."
                        + "\n"
                        + "O valor da nova folha de pagamento é de R$ "
                        + formatedNewPayroll
                        + "."
                        + "\n"
                        + "------------------------------------------------------------"
        );
    }
}
