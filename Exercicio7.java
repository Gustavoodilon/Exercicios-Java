import java.util.Scanner; 

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A nota 1: ");
        double N1 = scanner.nextDouble();
        System.out.print("A o peso da nota 1: ");
        double peso1 = scanner.nextDouble();

        System.out.print("A nota 2: ");
        double N2 = scanner.nextDouble();
        System.out.print("A o peso da nota 2: ");
        double peso2 = scanner.nextDouble();

        System.out.print("A nota 3: ");
        double N3 = scanner.nextDouble();
        System.out.print("A o peso da nota 3: ");
        double peso3 = scanner.nextDouble();

        double media = (N1 * peso1 + N2 * peso2 + N3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média do aluno é: %.2f\n", media);

        scanner.close();
    }
}