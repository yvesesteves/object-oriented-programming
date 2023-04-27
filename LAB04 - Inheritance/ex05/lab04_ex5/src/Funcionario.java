import java.time.LocalDate;
public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private double salario;
    private String funcao;


    public Funcionario(String nome,LocalDate dataNascimento,double salario) {
        this.nome = nome;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}