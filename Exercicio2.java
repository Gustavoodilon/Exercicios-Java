import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do N1: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o valor do N2: ");
        int n2 = scanner.nextInt();
        while (n2 < 0) {
            System.out.println("Digite um valor positivo para N2: ");
            n2 = scanner.nextInt();
        }

        System.out.println("Divisão do N1 com o N2: " + (n1 / n2));
    }
}