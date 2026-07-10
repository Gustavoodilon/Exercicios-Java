import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade em pes que deseja converter: ");
        double pes = scanner.nextDouble();

        System.out.printf("%.2f pes equivalem a %.2f polegadas\n", pes, pes * 12);
        System.out.printf("%.2f pes equivalem a %.2f jardas\n", pes, pes / 3);
        System.out.printf("%.2f pes equivalem a %.2f milhas\n", pes, ((pes / 3) / 1760));
        

        scanner.close();
    }
}