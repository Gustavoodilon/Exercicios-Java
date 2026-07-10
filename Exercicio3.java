import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida! Digite novamente a nota 1 (entre 0 e 10): ");
            nota1 = scanner.nextDouble();
        }

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida! Digite novamente a nota 2 (entre 0 e 10): ");
            nota2 = scanner.nextDouble();
        }

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota inválida! Digite novamente a nota 3 (entre 0 e 10): ");
            nota3 = scanner.nextDouble();
        }

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}