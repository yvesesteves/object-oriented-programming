import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Antonio", "70012022251", LocalDate.of(2002, 01, 29), "Solteiro", "Rua alameda, n 729, pacaembu", "M", 68888754, "20375820", "Gerente", 8900.50, LocalDate.of(2010, 05, 17), LocalDate.of(2020, 10, 10), 12345, true);
        Gerente gerente2 = new Gerente("Geraldo", "85246325413", LocalDate.of(1999, 05, 15), "Solteiro", "Rua são bernard, n 555, roosevelt", "M", 18852754, "10376823", "Gerente", 8900.50, LocalDate.of(2010, 05, 17), LocalDate.of(2020, 10, 10), 23415, true);
        Gerente gerente3 = new Gerente("Ana", "32142123562", LocalDate.of(1999, 05, 15), "Solteiro", "Rua são dorivaldo, n 235, Santa monica", "M", 70052546, "80341823", "Gerente", 8900.50, LocalDate.of(2010, 05, 17), LocalDate.of(2020, 10, 10), 54321, true);
        List<Agencia> agencias = new ArrayList<>();
        agencias = Agencia.deserializeAgencias();
        if(agencias.isEmpty())
        {
            agencias.add(new Agencia(12345, "Agencia Morumbi", gerente1, "Uberlandia", "MG", "Morumbi"));
            agencias.add(new Agencia(54321, "Santa monica", gerente3, "Uberlandia", "MG", "Santa monica"));
            agencias.add(new Agencia(23415, "Roosevelt", gerente2, "Uberlandia", "MG", "Roosevelt"));
            // Colocar aqui as novas agencias. Caso coloquem, devem apagar o arquivo Agencias.bin pra ele adicionar essa nova agencia
        }


        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            Menu.Principal();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            switch (opcao) {

                case 1: // Criando cadastro e conta de clientes
                    Menu.CadastroConta(agencias);
                    break;

                case 2:
                    System.out.println("Agencias");
                    for (int i = 0; i < agencias.size(); i++) {
                        System.out.println(i + 1 + "º -");
                        agencias.get(i).imprimirDados();
                        System.out.println();
                    }
                    System.out.println("Selecione o numero referente a sua agencia: ");
                    int selecAg = scanner.nextInt();
                    Menu.OperacoesBancarias(agencias,(selecAg - 1));
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }

            System.out.println(); // Pula uma linha para melhorar a legibilidade
        } while (opcao != 0);
    }
}
