import java.util.Arrays;

public class FolhaPagamento {
    private Funcionario[] funcionarios;

    public FolhaPagamento(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void mostrarFolha() {
        double totalSalarios = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.getSalario();
            totalSalarios += salario;
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + salario);
        }

        System.out.println("Total de salários: " + totalSalarios);
    }


}
