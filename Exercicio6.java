import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 6500;

        System.out.print("Digite o valor das vendas que o funcionário teve este mês: ");
        double vendas = scanner.nextDouble();

        while (vendas < 0) {
            System.out.println("Valor inválido! Digite novamente o valor das vendas (maior ou igual a 0): ");
            vendas = scanner.nextDouble();
        }

        System.out.printf("O salário final do funcionário é: R$ %.2f\n", salario + (vendas * 0.04));

        scanner.close();
    }
}