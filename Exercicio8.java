import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        while (base <= 0) {
            System.out.print("Valor inválido. Digite um valor positivo para a base: ");
            base = scanner.nextDouble();
        }

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        while (altura <= 0) {
            System.out.print("Valor inválido. Digite um valor positivo para a altura: ");
            altura = scanner.nextDouble();
        }

        System.out.printf("A área do triângulo é: %.2f\n", (base * altura) / 2);


        scanner.close();
    }
}