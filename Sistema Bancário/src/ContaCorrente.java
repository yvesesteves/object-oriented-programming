import java.time.LocalDate;

public class ContaCorrente extends Conta{

    private double limiteDoChequeEspecial = 1100.00;
    private double ValorTaxaADM = 0.26;
    // construtor para conta com 1 cliente

    public ContaCorrente(Agencia a, String numero, String senha, Cliente Dono) {
        super(a, numero, senha, Dono);

    }

    //construtor para conta em conjunto
    public ContaCorrente(Agencia a, String numero, String senha, Cliente Dono[], double limiteDoChequeEspecial, double valorTaxaADM) {
        super(a, numero, senha, Dono);
    }

    //--------------------------------------------- SETS AND GETTERS --------------------------------------------------

    @Override
    public void imprimeConta(){
        System.out.println("Nro: " + getNumero());
        System.out.println("Estadou conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }


    public void setLimiteDoChequeEspecial(double limiteDoChequeEspecial) {
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }

    public void setValorTaxaADM(double valorTaxaADM) {
        ValorTaxaADM = valorTaxaADM;
    }

    public double getLimiteDoChequeEspecial() {
        return limiteDoChequeEspecial;
    }

    public double getValorTaxaADM() {
        return ValorTaxaADM;
    }
}
