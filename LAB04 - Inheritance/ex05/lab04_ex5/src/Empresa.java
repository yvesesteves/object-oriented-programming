import java.time.LocalDate;
public class Empresa {

    public static void main(String[] args) {

        Chefe chefe1 = new Chefe("Gabriel", LocalDate.of(2000, 6, 21), 4000.0);
        Chefe chefe2 = new Chefe("Ana", LocalDate.of(1990, 3, 30), 5000.0);

        Vendedor vendedor1 = new Vendedor("Lucas", LocalDate.of(1998, 8, 8), 1300.0, 0.05, 5000.0);
        Vendedor vendedor2 = new Vendedor("Gabriela", LocalDate.of(1999, 9, 9), 1900.0, 0.03, 8000.0);

        Operario operario1 = new Operario("João", LocalDate.of(1985, 12, 7), 5.0, 200);
        Operario operario2 = new Operario("Bruna", LocalDate.of(1996, 4, 25), 6.0, 300);

        Horista horista1 = new Horista("Rafael", LocalDate.of(1997, 6, 12), 20.0, 80);
        Horista horista2 = new Horista("Talita", LocalDate.of(2001, 10, 30), 18.0, 120);

        Funcionario[] funcionarios = { chefe1, chefe2, vendedor1, vendedor2, operario1, operario2, horista1, horista2 };

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("-------------------");
        }

    }

}

