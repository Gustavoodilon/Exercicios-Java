import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o grau em C°: ");
        double celsius = scanner.nextDouble();

        System.out.printf("O valor em F° é: %.2f\n", (celsius * 9 / 5) + 32);

        scanner.close();
    }
}