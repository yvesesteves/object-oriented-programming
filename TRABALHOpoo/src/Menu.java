import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Menu {

    public static void Principal() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1. Criar Conta");
        System.out.println("2. Realizar Transação");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

    }

    public static void CadastroConta(List<Agencia> agencias) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        //Leitura da data de nascimento
        System.out.print("Data de nascimento (formato dd/MM/yyyy): ");
        String dataNasc = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataNasc, formatter);

        System.out.print("Digite Estado civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.print("Endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Sexo (formato M / F): ");
        String sexo = scanner.nextLine();

        System.out.print("Escolaridade: ");
        String escolaridade = scanner.nextLine();

        for (int i = 0; i < agencias.size(); i++) {
            System.out.println("Lista de agencias");
            System.out.println(i + 1 + "º");
            agencias.get(i).imprimirDados();
            System.out.println();
        }

        System.out.println("Digite o numero da agencia em que deseja se cadastrar: ");
        int SelectAg = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Cliente cliente = new Cliente(nome, cpf, data, estadoCivil, endereco, sexo, escolaridade, agencias.get(SelectAg - 1));
        agencias.get(SelectAg - 1).adicionarCliente(cliente);
        Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias

        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.println("Qual tipo de conta deseja abrir?");
        System.out.println("1. Conta Poupança");
        System.out.println("2. Conta Salario");
        System.out.println("3. Conta Corrente");
        System.out.println("0. Cancelar");
        System.out.println("Digite a opção: ");
        int op2 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (op2) {
            case 1:
                Conta conta1 = new ContaPoupanca(agencias.get(SelectAg - 1), numeroConta, senha, cliente);
                agencias.get(SelectAg - 1).setContas(conta1);
                break;
            case 2:
                Conta conta2 = new ContaSalario(agencias.get(SelectAg - 1), numeroConta, senha, cliente);
                agencias.get(SelectAg - 1).setContas(conta2);
                break;
            case 3:
                Conta conta3 = new ContaCorrente(agencias.get(SelectAg - 1), numeroConta, senha, cliente);
                agencias.get(SelectAg - 1).setContas(conta3);
                break;
        }
        Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias

    }

    public static void OperacoesBancarias(List<Agencia> agencias, int numero) {
        Scanner scanner = new Scanner(System.in);
        int op1;
        do {
            System.out.println("Qual tipo de transações deseja realizar: ");
            System.out.println("1. Saque");
            System.out.println("2. Depósito");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Efetuar pagamento");
            System.out.println("5. Realizar Transferencia");
            System.out.println("6. Mostrar transacoes da conta");
            System.out.println("0. Voltar");
            System.out.println("Digite a opção: ");
            op1 = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            List<Conta> ContasDaAg = agencias.get(numero).getContas();
            System.out.println("Digite o numero de sua conta: ");
            String NroConta = scanner.nextLine();

            boolean ContaTeste = false;
            for (Conta conta : ContasDaAg) {
                if (conta.getNumero().equals(NroConta)) {
                    ContaTeste = true; // se Numero da conta for igual ao numero informado, retorna true
                    break;
                }
            }

            if (ContaTeste) {
                Conta contaOperacao = agencias.get(numero).encontrarContaPorNumero(NroConta);

                try {
                    switch (op1) {
                        case 1:
                            System.out.println("Digite sua senha: ");
                            String senha1 = scanner.nextLine();
                            System.out.println("Digite o valor do saque: ");
                            double valorSaque1 = scanner.nextDouble();

                            try {
                                Operacoes.saque(valorSaque1, contaOperacao, senha1);
                            } catch (ParametroInvalido e) {
                                System.out.println(e.getMessage());
                            } catch (SenhaIncorreta e) {
                                System.out.println(e.getMessage());
                            } catch (ContaDesativada e) {
                                System.out.println(e.getMessage());
                            } catch (SaldoInsuficienteException e) {
                                System.out.println(e.getMessage());
                            } finally {
                                Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias
                            }

                            break;
                        case 2:
                            System.out.println("Digite sua senha: ");
                            String senha2 = scanner.nextLine();
                            System.out.println("Digite o valor do depósito: ");
                            double valorDeposito = scanner.nextDouble();

                            try {
                                Operacoes.deposito(valorDeposito, contaOperacao, senha2);
                            } catch (ParametroInvalido e) {
                                System.out.println(e.getMessage());
                            } catch (SenhaIncorreta e) {
                                System.out.println(e.getMessage());
                            } catch (ContaDesativada e) {
                                System.out.println(e.getMessage());
                            } catch (SaldoInsuficienteException e) {
                                System.out.println(e.getMessage());
                            } finally {
                                Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias
                            }
                            break;

                        case 3:
                            System.out.println("Digite sua senha: ");
                            String senha3 = scanner.nextLine();

                            try {
                                Operacoes.consultaSaldo(contaOperacao, senha3);
                            } catch (ParametroInvalido e) {
                                System.out.println(e.getMessage());
                            } catch (SenhaIncorreta e) {
                                System.out.println(e.getMessage());
                            } catch (ContaDesativada e) {
                                System.out.println(e.getMessage());
                            } catch (SaldoInsuficienteException e) {
                                System.out.println(e.getMessage());
                            } finally {
                                Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias
                            }
                            break;

                        case 4:
                            System.out.println("Digite sua chave pix (CPF): ");
                            String cpf4 = scanner.nextLine();
                            System.out.println("Digite sua senha: ");
                            String senha4 = scanner.nextLine();
                            System.out.println("Digite o valor que deseja pagar: ");
                            Double valorPag = scanner.nextDouble();

                            try {
                                Operacoes.efetuarPagamento(contaOperacao, senha4, cpf4, valorPag);
                            } catch (ParametroInvalido e) {
                                System.out.println(e.getMessage());
                            } catch (SenhaIncorreta e) {
                                System.out.println(e.getMessage());
                            } catch (ContaDesativada e) {
                                System.out.println(e.getMessage());
                            } catch (SaldoInsuficienteException e) {
                                System.out.println(e.getMessage());
                            } finally {
                                Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias
                            }

                            break;
                        case 5:
                            System.out.println("Digite sua senha: ");
                            String senha5 = scanner.nextLine();
                            System.out.println("Digite o valor que deseja transferir: ");
                            Double transfer = scanner.nextDouble();
                            scanner.nextLine(); // Limpa o buffer
                            System.out.println("Digite o número da conta que deseja transferir: ");
                            String NroContab = scanner.nextLine();
                            Conta contaTransferencia = agencias.get(numero).encontrarContaPorNumero(NroContab);
                            try {
                                Operacoes.Transferencia(contaOperacao, contaTransferencia, senha5, transfer);
                            } catch (ParametroInvalido e) {
                                System.out.println(e.getMessage());
                            } catch (SenhaIncorreta e) {
                                System.out.println(e.getMessage());
                            } catch (ContaDesativada e) {
                                System.out.println(e.getMessage());
                            } catch (SaldoInsuficienteException e) {
                                System.out.println(e.getMessage());
                            }catch (CPFinvalido e){
                                System.out.println(e.getMessage());
                            }
                            finally {
                                Serializacoes.serializeAgencias(agencias); // salvando as atualizacoes nas agencias
                            }
                            break;
                        case 6:
                            Transacoes.exibirTransacoesPorConta(contaOperacao);
                            break;
                    }
                } catch (ParametroInvalido e) {
                    System.out.println("Erro: Parâmetro inválido");
                }
            } else {
                System.out.println("Nao encontramos nenhuma conta com esse numero nessa agencia. Talvez você tenha selecionado a agencia errada?");
            }

        } while (op1 != 0);
    }
}


