import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do preço de fabrica do veiculo: ");
        double precoFabricaCarro = scanner.nextDouble();

        while (precoFabricaCarro < 0) {
            System.out.println("Valor inválido! Digite um valor positivo.");
            System.out.print("Digite o valor do preço de fabrica do veiculo: ");
            precoFabricaCarro = scanner.nextDouble();
        }

        System.out.println("Digite o valor do percentual de lucro: ");
        double percentualLucro = scanner.nextDouble();

        while (percentualLucro < 0) {
            System.out.println("Valor inválido! Digite um valor positivo.");
            System.out.println("Digite o valor do percentual de lucro: ");
            percentualLucro = scanner.nextDouble();
        }

        System.out.println("Digite o valor do percentual de imposto: ");
        double percentualImposto = scanner.nextDouble();

        while (percentualImposto < 0) {
            System.out.println("Valor inválido! Digite um valor positivo.");
            System.out.println("Digite o valor do percentual de imposto: ");
            percentualImposto = scanner.nextDouble();
        }
        
        

        System.out.printf("O valor do lucro do distribuidor é R$ %.2f\n", precoFabricaCarro - precoFabricaCarro * (percentualLucro / 100));
        System.out.printf("O valor do imposto é R$ %.2f\n", precoFabricaCarro * (percentualImposto / 100));
        System.out.printf("O preço final do veiculo é R$ %.2f\n", precoFabricaCarro + (precoFabricaCarro * (percentualLucro / 100)) + (precoFabricaCarro * (percentualImposto / 100)));
        

        scanner.close();
    }
}