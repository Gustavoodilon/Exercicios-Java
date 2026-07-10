import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        while (salarioBase < 0) {
            System.out.println("Salario inválido! Digite novamente o salario base (maior ou igual a 0): ");
            salarioBase = scanner.nextDouble();
        }

        double salarioFinal = (salarioBase * 1.05) - (salarioBase * 0.07);

        System.out.printf("Salario final do funcionario: R$ %.2f\n", salarioFinal);


        scanner.close();
    }
}