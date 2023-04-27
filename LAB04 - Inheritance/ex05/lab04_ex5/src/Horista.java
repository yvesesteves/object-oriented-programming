import java.time.LocalDate;
class Horista extends Funcionario {
    private double valorPorHora;
    private int totalHoras;

    public Horista(String nome, LocalDate dataNascimento, double valorPorHora, int totalHoras) {
        super(nome, dataNascimento,0);
        this.valorPorHora = valorPorHora;
        this.totalHoras = totalHoras;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    @Override
    public double getSalario() {
        return valorPorHora * totalHoras;
    }

}