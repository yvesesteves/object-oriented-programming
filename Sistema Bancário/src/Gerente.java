import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Gerente extends Funcionario {
    private LocalDate ingressãoGerencia;
    private int agencia;
    private boolean possuiCurso;
    private static double comissão= 500;

    public Gerente(String nome, String cpf, LocalDate dataNasc, String estadoCivil, String endereco, String sexo, int carteiraTrab, String rg, String cargoEmpresa, double salario, LocalDate anoIngressão, LocalDate ingressãoGerencia, int agencia, boolean possuiCurso) {
        super(nome, cpf, dataNasc, estadoCivil, endereco, sexo, carteiraTrab, rg, cargoEmpresa, salario, anoIngressão);
        this.ingressãoGerencia = ingressãoGerencia;
        this.agencia = agencia;
        this.possuiCurso = possuiCurso;
    }


    public LocalDate getIngressãoGerencia() {
        return ingressãoGerencia;
    }

    public void setIngressãoGerencia(LocalDate ingressãoGerencia) {
        this.ingressãoGerencia = ingressãoGerencia;
    }

    public boolean isPossuiCurso() {
        return possuiCurso;
    }

    public void setPossuiCurso(boolean possuiCurso) {
        this.possuiCurso = possuiCurso;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }


    private double calculaSalGerente() {

        /*
            Salario base + comissao + 10%(se 15 anos ou mais de empresa)
         */
        LocalDate dataAtual = LocalDate.now();
        long anosDeEmpresa = getAnoIngressão().until(dataAtual, ChronoUnit.YEARS);
        if (anosDeEmpresa > 15) {
            double aumento = getSalario() * 0.1; // 10% de aumento se tiver mais de 15 anos de empresa
            setSalario(getSalario() + aumento + getComissão());
            return getSalario();
        } else {
            return getSalario() + getComissão();
        }
    }
}

