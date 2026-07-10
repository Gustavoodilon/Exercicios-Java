import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario minimo: ");
        double salarioMinimo = scanner.nextDouble();

        while (salarioMinimo < 0) {
            System.out.println("Valor inválido! Digite um valor positivo.");
            System.out.print("Digite o salario minimo: ");
            salarioMinimo = scanner.nextDouble();
        }

        System.out.print("Digite a quantidade de quilowatts consumida por residencia: ");
        double quantidadeQuilowatts = scanner.nextDouble();

        double valorQuilowatt = salarioMinimo / 5;
        double valorTotal = quantidadeQuilowatts * valorQuilowatt;
        double valorComDesconto = valorTotal - (valorTotal * 0.15);

        System.out.printf("O valor do quilowatt é R$ %.2f\n", valorQuilowatt);
        System.out.printf("O valor total a ser pago é R$ %.2f\n", valorTotal);
        System.out.printf("O valor a ser pago com desconto é R$ %.2f\n", valorComDesconto);
        
        scanner.close();
    }
}