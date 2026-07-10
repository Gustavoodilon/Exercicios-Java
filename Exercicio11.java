import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de nascimento (dd/mm/aaaa): ");
        String entrada = scanner.nextLine();

        try {
            String[] partes = entrada.split("/");
            
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            LocalDate dataNasc = LocalDate.of(ano, mes, dia);
            LocalDate dataAtual = LocalDate.now();

            if (dataNasc.isAfter(dataAtual)) {
                System.out.println("A data de nascimento não pode ser no futuro!");
            } else {
                int anos = dataAtual.getYear() - dataNasc.getYear();
                int mesesRestantes = dataAtual.getMonthValue() - dataNasc.getMonthValue();
                int diasRestantes = dataAtual.getDayOfMonth() - dataNasc.getDayOfMonth();

                if (mesesRestantes < 0 || (mesesRestantes == 0 && diasRestantes < 0)) {
                    anos--;
                    mesesRestantes = 12 + mesesRestantes;
                }
                
                if (diasRestantes < 0 && mesesRestantes > 0) {
                    mesesRestantes--;
                }

                int mesesTotais = (anos * 12) + mesesRestantes;
                long diasTotais = dataAtual.toEpochDay() - dataNasc.toEpochDay();
                long semanasTotais = diasTotais / 7;

                System.out.println("\n--- Resultado do Cálculo ---");
                System.out.println("Idade exata: " + anos + " anos e " + mesesRestantes + " meses.");
                System.out.println("Total em meses: " + mesesTotais + " meses.");
                System.out.println("Total em semanas: " + semanasTotais + " semanas.");
            }

        } catch (Exception e) {
            System.out.println("Erro: Digite a data no formato correto usando barras (ex: 15/05/2000).");
        } finally {
            scanner.close();
        }
    }
}
