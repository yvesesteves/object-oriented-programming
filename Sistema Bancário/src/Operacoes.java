import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public interface Operacoes{


    static void saque(double valorSaque, Conta conta, String senha)
    {
        if(valorSaque<0){throw new ParametroInvalido("Nao é possivel sacar valores menores do que 0.");}
        conta.imprimeConta();
        if(conta.getSenha().compareTo(senha)!=0){throw new SenhaIncorreta("Senha Incorreta. Verifique se o Capslock nao esta ligado");}
        if(conta.getEstadoDaConta()==false){throw new ContaDesativada("A operacao nao foi possivel pois a conta esta desativada");}
        int sucesso = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o canal da transação:");
        System.out.println("1 - Internet Banking");
        System.out.println("2 - Caixa Eletrônico");
        System.out.println("3 - Caixa Físico");

        int opcao = scanner.nextInt();
        String canal;

        switch (opcao) {
            case 1:
                canal = "Internet Banking";
                break;
            case 2:
                canal = "Caixa Eletrônico";
                break;
            case 3:
                canal = "Caixa Físico";
                break;
            default:
                canal = "Canal inválido";
                break;
        }
        if (conta instanceof ContaCorrente)
        {
            if (conta.getSaldo() >= valorSaque) {
                conta.setSaldo(conta.getSaldo() - valorSaque);
                System.out.println("Valor sacado com sucesso!");
                sucesso = 1;
            } else if (conta instanceof ContaCorrente) {
                double saldoComLimite = conta.getSaldo() + ((ContaCorrente) conta).getLimiteDoChequeEspecial();
                if (saldoComLimite < valorSaque) {
                    throw new SaldoInsuficienteException("Saldo e Cheque especial insuficientes.");
                } else {
                    double descontoNoCheque = valorSaque - conta.getSaldo();
                    conta.setSaldo(0);
                    ((ContaCorrente) conta).setLimiteDoChequeEspecial(((ContaCorrente) conta).getLimiteDoChequeEspecial() - descontoNoCheque);
                    System.out.println("Valor sacado com sucesso! Foi necessário utilizar o cheque especial. O valor atual do cheque especial é " + ((ContaCorrente) conta).getLimiteDoChequeEspecial());
                    sucesso = 1;
                }
            } else {
                throw new SaldoInsuficienteException("Saldo Insuficiente.");
            }

        }
        if(conta instanceof ContaSalario)
        {
          if(conta.getSaldo()<valorSaque)
               {
                   throw new SaldoInsuficienteException("Saldo Insuficiente");
               }
          if(((ContaSalario) conta).getLimiteSaque()<valorSaque)
          {
              throw new SaldoInsuficienteException("Tentativa de saque acima do limite de saque");
          }
          else
          {
              conta.setSaldo(conta.getSaldo()-valorSaque);
              System.out.println("Valor sacado com sucesso!");
              sucesso = 1;
          }
        }
        if(conta instanceof ContaPoupanca)
        {
            if(conta.getSaldo()>valorSaque)
            {
                conta.setSaldo(conta.getSaldo() - valorSaque);
                System.out.println("Valor sacado com sucesso!");
                sucesso = 1;
            }
            else
                throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        if(sucesso == 1){
            // Criação do objeto Transacoes
            Transacoes transacao = new Transacoes(conta, LocalDate.now(), canal,"Saque",valorSaque);
            Serializacoes.serializeTransacoes(transacao);
        }


    }
        static void deposito(double valorDeposito, Conta conta,String senha) {
            if (valorDeposito < 0) {
                throw new ParametroInvalido("Nao é possivel depositar valores menores do que 0.");
            }
            if (conta.getSenha().compareTo(senha) != 0) {
                throw new SenhaIncorreta("Senha Incorreta. Verifique se o Capslock nao esta ligado");
            }
            if (conta.getEstadoDaConta() == false) {
                throw new ContaDesativada("A operacao nao foi possivel pois a conta esta desativada");
            }
            int sucesso = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o canal da transação:");
            System.out.println("1 - Internet Banking");
            System.out.println("2 - Caixa Eletrônico");
            System.out.println("3 - Caixa Físico");

            int opcao = scanner.nextInt();
            String canal;

            switch (opcao) {
                case 1:
                    canal = "Internet Banking";
                    break;
                case 2:
                    canal = "Caixa Eletrônico";
                    break;
                case 3:
                    canal = "Caixa Físico";
                    break;
                default:
                    canal = "Canal inválido";
                    break;
            }

            conta.setSaldo(conta.getSaldo() + valorDeposito);
            sucesso = 1;
            System.out.println("O valor foi depositado.");
            if (sucesso == 1) {
                // Criação do objeto Transacoes
                Transacoes transacao = new Transacoes(conta, LocalDate.now(), canal, "Deposito", valorDeposito);

                Serializacoes.serializeTransacoes(transacao);

            }
        }
        static double consultaSaldo(Conta conta,String senha) {
            if (conta.getSenha().compareTo(senha) != 0) {
                throw new SenhaIncorreta("Senha Incorreta. Verifique se o Capslock nao esta ligado");
            }
            if (conta.getEstadoDaConta() == false) {
                throw new ContaDesativada("A operacao nao foi possivel pois a conta esta desativada");
            }
            System.out.println("O Saldo atual é:" + conta.getSaldo());
            if (conta instanceof ContaCorrente) {
                System.out.println("Limite do cheque especial:" + ((ContaCorrente) conta).getLimiteDoChequeEspecial());
                System.out.println("Taxa admnistrativa" + ((ContaCorrente) conta).getValorTaxaADM());
            }
            if (conta instanceof ContaPoupanca) {
                System.out.println("Rendimento:"+((ContaPoupanca) conta).getRendimento());

            }
            if(conta instanceof ContaSalario){
                System.out.println("Limite Saque"+((ContaSalario) conta).getLimiteSaque());
                System.out.println("Limite transferencia"+((ContaSalario) conta).getLimiteTransferencia());
            }


                return conta.getSaldo();
            }
        static void efetuarPagamento(Conta conta,String senha,String cpf,double valorSaque)
        {

            if(valorSaque<0){throw new ParametroInvalido("Nao é possivel sacar valores menores do que 0.");}
            if(conta.getSenha().compareTo(senha)!=0){throw new SenhaIncorreta("Senha Incorreta. Verifique se o Capslock nao esta ligado");}
            if(conta.getEstadoDaConta()==false){throw new ContaDesativada("A operacao nao foi possivel pois a conta esta desativada");}
            if(Operacoes.validarCPF(cpf)==false){throw new CPFinvalido("O cpf informado é invalido");}
            // daqui pra baixo é um ctrl c + ctrl v da funcao de saque
            int sucesso = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o canal da transação:");
            System.out.println("1 - Internet Banking");
            System.out.println("2 - Caixa Eletrônico");
            System.out.println("3 - Caixa Físico");

            int opcao = scanner.nextInt();
            String canal;

            switch (opcao) {
                case 1:
                    canal = "Internet Banking";
                    break;
                case 2:
                    canal = "Caixa Eletrônico";
                    break;
                case 3:
                    canal = "Caixa Físico";
                    break;
                default:
                    canal = "Canal inválido";
                    break;
            }



            if (conta instanceof ContaCorrente)
            {
                if(conta.getSaldo()>=valorSaque)
                {
                    conta.setSaldo(conta.getSaldo()-valorSaque);
                    System.out.println("Pagamento efetuado!");
                    sucesso = 1;
                }
                if (conta.getSaldo() + ((ContaCorrente) conta).getLimiteDoChequeEspecial() < valorSaque)
                    throw new SaldoInsuficienteException("Saldo e Cheque especial insuficientes.");
                else
                {
                    double DescontoNoCheque = valorSaque - conta.getSaldo();
                    conta.setSaldo(0);
                    ((ContaCorrente) conta).setLimiteDoChequeEspecial(((ContaCorrente) conta).getLimiteDoChequeEspecial()-DescontoNoCheque);// basicamente estou fazendo LimiteChequeEspecial =- DescontoNoCheque. Sao muitos castings....
                    System.out.println("Pagamento efetuado com sucesso! Foi necessário utilizar o cheque especial. O valor atual do cheque especial é "+((ContaCorrente) conta).getLimiteDoChequeEspecial());
                    sucesso = 1;

                }

            }
            if(conta instanceof ContaSalario)
            {
                if(conta.getSaldo()<valorSaque)
                {
                    throw new SaldoInsuficienteException("Saldo Insuficiente");
                }
                if(((ContaSalario) conta).getLimiteSaque()<valorSaque)
                {
                    throw new SaldoInsuficienteException("Tentativa de pagamento acima do limite da conta");
                }
                else
                {
                    conta.setSaldo(conta.getSaldo()-valorSaque);
                    System.out.println("Pagamento efetuado com sucesso!");
                    sucesso = 1;
                }
            }
            if(conta instanceof ContaPoupanca)
            {
                if(conta.getSaldo()>valorSaque)
                {
                    conta.setSaldo(conta.getSaldo() - valorSaque);
                    System.out.println("Pagamento efetuado com sucesso!");
                    sucesso = 1;
                }
                else
                    throw new SaldoInsuficienteException("Saldo Insuficiente");
            }
            if(sucesso == 1)
            {
                String tipo = "Pagamento: "+ cpf;
                // Criação do objeto Transacoes
                Transacoes transacao = new Transacoes(conta, LocalDate.now(), canal,tipo,valorSaque);
                Serializacoes.serializeTransacoes(transacao);
            }
        }
    public static void Transferencia(Conta conta,Conta contab,String senha,double valorSaque)// FUNCAO EXTRA. Transferece da primeira conta pra segunda
    {
        // também é praticamente uma copia da funcao de saque
        if(valorSaque<0){throw new ParametroInvalido("Nao é possivel transferir valores menores do que 0.");}
        if(conta.getSenha().compareTo(senha)!=0){throw new SenhaIncorreta("Senha Incorreta. Verifique se o Capslock nao esta ligado");}
        if(conta.getEstadoDaConta()==false|| contab.getEstadoDaConta()==false){throw new ContaDesativada("A operacao nao foi possivel pois uma ou mais contas estao desativadas.");}
        int sucesso = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o canal da transação:");
        System.out.println("1 - Internet Banking");
        System.out.println("2 - Caixa Eletrônico");
        System.out.println("3 - Caixa Físico");

        int opcao = scanner.nextInt();
        String canal;

        switch (opcao) {
            case 1:
                canal = "Internet Banking";
                break;
            case 2:
                canal = "Caixa Eletrônico";
                break;
            case 3:
                canal = "Caixa Físico";
                break;
            default:
                canal = "Canal inválido";
                break;
        }
        if (conta instanceof ContaCorrente)
        {
            if(conta.getSaldo()>=valorSaque)
            {
                conta.setSaldo(conta.getSaldo()-valorSaque);
                contab.setSaldo(contab.getSaldo()+valorSaque);//transferindo os valores
                System.out.println("Transferencia feita com sucesso!");
                sucesso = 1;
            }
            if (conta.getSaldo() + ((ContaCorrente) conta).getLimiteDoChequeEspecial() < valorSaque)
                throw new SaldoInsuficienteException("Saldo e Cheque especial insuficientes.");
            else
            {
                double DescontoNoCheque = valorSaque - conta.getSaldo();
                conta.setSaldo(0);
                ((ContaCorrente) conta).setLimiteDoChequeEspecial(((ContaCorrente) conta).getLimiteDoChequeEspecial()-DescontoNoCheque);// basicamente estou fazendo LimiteChequeEspecial =- DescontoNoCheque. Sao muitos castings....
                contab.setSaldo(contab.getSaldo()+valorSaque);
                System.out.println("Transferencia feita com sucesso! Foi necessário utilizar o cheque especial. O valor atual do cheque especial é "+((ContaCorrente) conta).getLimiteDoChequeEspecial());
                sucesso = 1;
            }

        }
        if(conta instanceof ContaSalario)
        {
            if(conta.getSaldo()<valorSaque)
            {
                throw new SaldoInsuficienteException("Saldo Insuficiente");
            }
            if(((ContaSalario) conta).getLimiteSaque()<valorSaque)
            {
                throw new SaldoInsuficienteException("Tentativa de transferencia acima do limite da conta");
            }
            else
            {
                sucesso = 1;
                conta.setSaldo(conta.getSaldo()-valorSaque);
                contab.setSaldo(contab.getSaldo()+valorSaque);
                System.out.println("Transferencia feita com sucesso!");
            }
        }
        if(conta instanceof ContaPoupanca)
        {
            if(conta.getSaldo()>valorSaque)
            {
                conta.setSaldo(conta.getSaldo() - valorSaque);
                contab.setSaldo(contab.getSaldo()+valorSaque);
                System.out.println("Transferencia feita com sucesso!");
                sucesso = 1;
            }
            else
                throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        if(sucesso == 1){
            // Criação do objeto Transacoes
            Transacoes transacao = new Transacoes(conta, LocalDate.now(), canal,"Transferencia entre contas",valorSaque);

            // Salvando o objeto em um arquivo binário
            Serializacoes.serializeTransacoes(transacao);
        }
    }

        public static boolean validarCPF(String cpf) {
            // Remover caracteres não numéricos do CPF
            cpf = cpf.replaceAll("[^\\d]", "");

            // Verificar se o CPF possui 11 dígitos
            if (cpf.length() != 11) {
                return false;
            }

            // Verificar se todos os dígitos do CPF são iguais
            boolean todosDigitosIguais = true;
            for (int i = 1; i < cpf.length(); i++) {
                if (cpf.charAt(i) != cpf.charAt(0)) {
                    todosDigitosIguais = false;
                    break;
                }
            }
            if (todosDigitosIguais) {
                return false;
            }

            // Calcular os dígitos verificadores do CPF
            int[] digitosCPF = new int[11];
            for (int i = 0; i < cpf.length(); i++) {
                digitosCPF[i] = Character.getNumericValue(cpf.charAt(i));
            }

            int soma = 0;
            int peso = 10;
            for (int i = 0; i < 9; i++) {
                soma += digitosCPF[i] * peso;
                peso--;
            }

            int resto = soma % 11;
            int digito1 = resto < 2 ? 0 : 11 - resto;

            soma = 0;
            peso = 11;
            for (int i = 0; i < 10; i++) {
                soma += digitosCPF[i] * peso;
                peso--;
            }

            resto = soma % 11;
            int digito2 = resto < 2 ? 0 : 11 - resto;

            // Verificar se os dígitos verificadores calculados são iguais aos do CPF
            return digito1 == digitosCPF[9] && digito2 == digitosCPF[10];
        }
    }



