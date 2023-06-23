import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcionario extends Pessoa {
    private int carteiraTrab;
    private String rg;
    private String cargoEmpresa;
    private double salario = 1320.00;
    private LocalDate anoIngressão;

    public Funcionario(String nome, String cpf, LocalDate dataNasc, String estadoCivil, String endereco, String sexo, int carteiraTrab, String rg, String cargoEmpresa, double salario, LocalDate anoIngressão) {
        super(nome, cpf, dataNasc, estadoCivil, endereco, sexo);
        this.carteiraTrab = carteiraTrab;
        this.rg = rg;
        this.cargoEmpresa = cargoEmpresa;
        this.salario = salario;
        this.anoIngressão = anoIngressão;
    }

    public int getCarteiraTrab() {
        return carteiraTrab;
    }

    public void setCarteiraTrab(int carteiraTrab) {
        this.carteiraTrab = carteiraTrab;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCargoEmpresa() {
        return cargoEmpresa;
    }

    public void setCargoEmpresa(String cargoEmpresa) {
        this.cargoEmpresa = cargoEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getAnoIngressão() {
        return anoIngressão;
    }

    public void setAnoIngressão(LocalDate anoIngressão) {
        this.anoIngressão = anoIngressão;
    }

    public double calculaSalario() {
        LocalDate dataAtual = LocalDate.now();
        long anosDeEmpresa = getAnoIngressão().until(dataAtual, ChronoUnit.YEARS);

        if (anosDeEmpresa > 15) {
            double aumento = getSalario() * 0.1; // 10% de aumento se tiver mais de 15 anos de empresa
            setSalario(getSalario() + aumento);
            return getSalario();
        } else {
            return getSalario();
        }
    }

}
