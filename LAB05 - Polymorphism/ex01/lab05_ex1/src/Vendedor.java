import java.time.LocalDate;
class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, LocalDate dataNascimento, double valorFixo, double comissao, double vendas) {
        super(nome, dataNascimento,0);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public double getComissao() {
        return comissao;
    }

    public double getVendas() {
        return vendas;
    }

    @Override
    public double getSalario() {
        return valorFixo + comissao * vendas;
    }

}