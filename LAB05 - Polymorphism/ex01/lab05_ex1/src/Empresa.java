import java.time.LocalDate;
public class Empresa {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0] = new Chefe("João", LocalDate.of(1980, 1, 1), 5000.0);
        funcionarios[1] = new Horista("Maria", LocalDate.of(1990, 2, 2), 50.0, 160);
        funcionarios[2] = new Operario("Pedro", LocalDate.of(1995, 3, 3), 5.0, 1000);
        funcionarios[3] = new Vendedor("Ana", LocalDate.of(1985, 4, 4), 2000.0, 0.05, 50000.0);

        FolhaPagamento folha = new FolhaPagamento(funcionarios);
        folha.mostrarFolha();

    }

}

