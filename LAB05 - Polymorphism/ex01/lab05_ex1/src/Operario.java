import java.time.LocalDate;
class Operario extends Funcionario {
    private double valorPorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, LocalDate dataNascimento, double valorPorProducao, int quantidadeProduzida) {
        super(nome,dataNascimento,0);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double getValorPorProducao() {
        return valorPorProducao;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    @Override
    public double getSalario() {
        return valorPorProducao * quantidadeProduzida;
    }

}
