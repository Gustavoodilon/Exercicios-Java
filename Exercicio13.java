import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        while (horasTrabalhadas < 0) {
            System.out.println("Valor inválido! Digite um valor positivo.");
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horasTrabalhadas = scanner.nextDouble();
        }

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        while (salarioMinimo < 0) {
            System.out.println("Valor inválido! Digite um valor positivo.");
            System.out.println("Digite o valor do salário mínimo: ");
            salarioMinimo = scanner.nextDouble();
        }

        double valorHora = salarioMinimo / 10;
        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.printf("O valor do salario com os descontos é R$ %.2f\n", salarioBruto - (salarioBruto * 0.03));

        scanner.close();
    }
}