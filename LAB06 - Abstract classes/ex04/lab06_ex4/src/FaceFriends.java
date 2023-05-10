import java.time.LocalDate;
import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        /*
        Familia f = new Familia("Zé", "José Vitor", "zevitor@gmail.com", LocalDate.of(1980, 1, 1),"Pai");
        f.imprimirContato();

        Amigos a = new Amigos("Jorginho", "Jorge", "jorge@gmail.com", LocalDate.of(2000,12,17), 2);
        a.imprimirContato();

        Trabalho t = new Trabalho("Gabi", "Gabriela", "gabi@gmail.com", LocalDate.of(1995,5,8), "Chefe");
        t.imprimirContato();
        */
        Scanner scanner = new Scanner(System.in);
        Contato[] contatos = new Contato[100];
        int totalContatos = 0;

        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("1. Inserir um contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente os familiares");
            System.out.println("4. Imprimir somente os amigos");
            System.out.println("5. Imprimir somente os colegas de trabalho");
            System.out.println("6. Imprimir melhores amigos, irmãos e colegas de trabalho");
            System.out.println("7. Imprimir dados de um único contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("Inserir um contato");
                    System.out.print("Subtipo (Família (F), Amigos (A) ou Trabalho(T): ");
                    String subtipo = scanner.nextLine();

                    if (subtipo.equalsIgnoreCase("F" )) {
                        System.out.print("Apelido: ");
                        String apelido = scanner.nextLine();
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Aniversário (AAAA-MM-DD): ");
                        String aniversarioStr = scanner.nextLine();
                        LocalDate aniversario = LocalDate.parse(aniversarioStr);
                        System.out.print("Parentesco: ");
                        String parentesco = scanner.nextLine();

                        contatos[totalContatos] = new Familia(apelido, nome, email, aniversario, parentesco);
                        totalContatos++;
                        System.out.println("Contato inserido com sucesso!");
                        System.out.println("\n");
                    } else if (subtipo.equalsIgnoreCase("A")) {
                        System.out.print("Apelido: ");
                        String apelido = scanner.nextLine();
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Aniversário (AAAA-MM-DD): ");
                        String aniversarioStr = scanner.nextLine();
                        LocalDate aniversario = LocalDate.parse(aniversarioStr);
                        System.out.print("Grau (1 - Melhor amigo, 2 - Amigo, 3 - Conhecido): ");
                        int grau = scanner.nextInt();

                        contatos[totalContatos] = new Amigos(apelido, nome, email, aniversario, grau);
                        totalContatos++;
                        System.out.println("Contato inserido com sucesso!");
                        System.out.println("\n");
                    } else if (subtipo.equalsIgnoreCase("T")) {
                        System.out.print("Apelido: ");
                        String apelido = scanner.nextLine();
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Aniversário (AAAA-MM-DD): ");
                        String aniversarioStr = scanner.nextLine();
                        LocalDate aniversario = LocalDate.parse(aniversarioStr);
                        System.out.print("Tipo de contato: ");
                        String tipo = scanner.nextLine();

                        contatos[totalContatos] = new Trabalho(apelido, nome, email, aniversario, tipo);
                        totalContatos++;
                        System.out.println("Contato inserido com sucesso!");
                        System.out.println("\n");
                    } else {
                        System.out.println("Subtipo inválido!");
                    }
                    break;

                case 2:
                    System.out.println("Imprimir todos os contatos");
                    for (int i = 0; i < totalContatos; i++) {
                        contatos[i].imprimirContato();
                    }
                    break;

                case 3:
                    System.out.println("Imprimir somente os familiares");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Familia) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Imprimir somente os amigos");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Amigos) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Imprimir somente os colegas de trabalho");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Trabalho) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Imprimir melhores amigos, irmãos e colegas de trabalho");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Amigos && ((Amigos) contatos[i]).getGrau() == 1) {
                            contatos[i].imprimirContato();
                        }
                        if (contatos[i] instanceof Familia && ((Familia) contatos[i]).getParentesco().equalsIgnoreCase("irmão")) {
                            contatos[i].imprimirContato();
                        }
                        if (contatos[i] instanceof Trabalho && ((Trabalho) contatos[i]).getTipo().equalsIgnoreCase("colega")) {
                            contatos[i].imprimirContato();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Imprimir dados de um único contato");
                    System.out.print("Índice do contato: ");
                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice < totalContatos) {
                        Contato contato = contatos[indice];
                        if (contato instanceof Familia) {
                            System.out.println("<<Família>>");
                        } else if (contato instanceof Amigos) {
                            System.out.println("<<Amigos>>");
                        } else if (contato instanceof Trabalho) {
                            System.out.println("<<Trabalho>>");
                        }

                        contato.imprimirContato();
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("-----------------");
        } while (opcao != 0);

        scanner.close();
    }
}

