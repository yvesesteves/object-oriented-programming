import java.time.LocalDate;

public class Chefe extends Funcionario{
    private double salarioFixo;
    public Chefe(String nome, LocalDate dataNascimento, double salarioFixo) {
        super(nome, dataNascimento, 0);
        this.salarioFixo = salarioFixo;

    }
    public double getSalarioFixo() {
        return salarioFixo;
    }

    @Override
    public double getSalario() {
        return salarioFixo;
    }

}
