import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do número A:");
        int a = scanner.nextInt();
        
        System.out.println("Digite o valor do número B:");
        int b = scanner.nextInt();

        System.out.println("Subtração dos números: " + (a - b));


    }
}