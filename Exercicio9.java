import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        System.out.printf("A área do quadrado é: %.2f\n", ladoQuadrado * ladoQuadrado);

        scanner.close();
    }
}