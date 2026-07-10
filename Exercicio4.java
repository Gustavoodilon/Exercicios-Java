import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        while (valorProduto < 0) {
            System.out.println("Valor inválido! Digite novamente o valor do produto (maior ou igual a 0): ");
            valorProduto = scanner.nextDouble();
        }

        System.out.print("Digite a % de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        while (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("Percentual inválido! Digite novamente a % de desconto (entre 0 e 100): ");
            percentualDesconto = scanner.nextDouble();
        }

        double valorDesconto = (valorProduto * percentualDesconto) / 100;
        double valorFinal = valorProduto - valorDesconto;

        System.out.println("O valor do produto com desconto é: " + valorFinal);

        scanner.close();
    }
}