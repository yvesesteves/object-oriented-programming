public class Main {
    /*
        QUESTAO 2 - RESPOSTAS
        (a) - o throw é usado para lançar explicitamente uma exceção em um bloco de código,
                enquanto o throws é usado para declarar que um método pode lançar exceções.

       (b) - Checked exceptions são obrigatórias de serem tratadas ou declaradas, enquanto unchecked exceptions
                não são verificadas pelo compilador e não exigem tratamento obrigatório.
     */

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("348.685.172-45", "Lucas", 25000.0);
        Funcionario funcionario2 = new Funcionario("526.145.985-20", "Gabriela", 35000.0);
        funcionario.mostrarDados();
        funcionario2.mostrarDados();
        try {
            System.out.println("\n<<Funcionarios e seus respectivos novos salarios>>");
            funcionario.aumentoSalarial(10); // aumenta o salário em 10%
            funcionario2.aumentoSalarial(15); // aumenta salario em 15%
        } catch (SalarioInvalidoException e) {
            System.out.println("\nERRO: " + e.getMessage());
        }


    }
}
