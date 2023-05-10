public class UsaBanco {
    public static void main(String[] args) {
        // Criação de objetos da classe ContaEspecial
        ContaEspecial conta1 = new ContaEspecial(1000, 1, 1234, 500);
        ContaEspecial conta2 = new ContaEspecial(2000, 2, 5678, 1000);
        System.out.println("----------------------");

        // Realização de débitos nas contas
        boolean debito1 = conta1.debitaValor(700, 1234);
        boolean debito2 = conta1.debitaValor(900, 1234);
        boolean debito3 = conta2.debitaValor(1500, 5678);
        boolean debito4 = conta2.debitaValor(2500, 5678);

        // Análise do funcionamento do sistema
        System.out.println("Saldo da conta 1: " + conta1.getSaldo(1234)); // Saída: Saldo da conta 1: 400.0
        System.out.println("Limite da conta 1: " + ((ContaEspecial) conta1).getLimite()); // Saída: Limite da conta 1: 500.0
        System.out.println("Saldo da conta 2: " + conta2.getSaldo(5678)); // Saída: Saldo da conta 2: 500.0
        System.out.println("Limite da conta 2: " + ((ContaEspecial) conta2).getLimite()); // Saída: Limite da conta 2: 1000.0
        System.out.println("Débito realizado na conta 1: " + debito1); // Saída: Débito realizado na conta 1: true
        System.out.println("Débito realizado na conta 1: " + debito2); // Saída: Débito realizado na conta 1: false (limite excedido)
        System.out.println("Débito realizado na conta 2: " + debito3); // Saída: Débito realizado na conta 2: true
        System.out.println("Débito realizado na conta 2: " + debito4); // Saída: Débito realizado na conta 2: false (saldo insuficiente)
    }
}
