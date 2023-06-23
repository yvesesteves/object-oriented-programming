
import java.time.LocalDate;
import java.io.Serializable;

public abstract class Conta implements Serializable {
    //private static final long serialVersionUID = 12345;
    private Agencia agencia;
    private Cliente Donos[];
    private Cliente Dono;
    private boolean ContaConjunta;
    private String NroConta;
    private String senha;
    private Boolean EstadoDaConta;
    private double saldo;
    private LocalDate DataDeAbartura;
    private LocalDate DataDeUltimaMovimentacao;
    public Conta(Conta conta){}
    //construtor para conta com 1 dono
    public Conta(Agencia a, String numeroDaConta,String senha,Cliente Dono){
        agencia = a;
        this.NroConta = numeroDaConta;
        this.senha = senha;
        this.Dono = Dono;
        this.ContaConjunta = false;
        setEstadoDaConta(true);
        setDataDeAbartura(LocalDate.now());
        setSaldo(0);
    }
    // construtor para conta em conjunto
    public Conta(Agencia a, String numeroDaConta,String senha,Cliente Donos[]){
        agencia = a;
        this.NroConta = numeroDaConta;
        this.senha = senha;
        this.Donos = Donos;
        this.ContaConjunta = true;
        setEstadoDaConta(true);
        setDataDeAbartura(LocalDate.now());
        setSaldo(0);
    }


    //--------------------------------------------- SETS AND GETTERS --------------------------------------------------


    public boolean isContaConjunta() {
        return ContaConjunta;
    }

    public Cliente[] getDonos() {
        return Donos;
    }

    public void setDonos(Cliente[] donos) {
        ContaConjunta = true;
        Donos = donos;
    }

    public Cliente getDono() {
        return Dono;
    }

    public void setDono(Cliente dono) {
        ContaConjunta = false;
        Dono = dono;
    }

    public Agencia getAgencia() {
        return agencia;
    }


    public String getSenha() {
        return senha;
    }

    public void setNumero(String numero) {
        this.NroConta = numero;
    }

    public void setDataDeAbartura(LocalDate dataDeAbartura) {
        DataDeAbartura = dataDeAbartura;
    }

    public void setDataDeUltimaMovimentacao(LocalDate dataDeUltimaMovimentacao) {
        DataDeUltimaMovimentacao = dataDeUltimaMovimentacao;
    }

    public void setEstadoDaConta(Boolean estadoDaConta) {
        EstadoDaConta = estadoDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumero() {
        return NroConta;
    }

    public Boolean getEstadoDaConta() {
        return EstadoDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataDeAbartura() {
        return DataDeAbartura;
    }

    public LocalDate getDataDeUltimaMovimentacao() {
        return DataDeUltimaMovimentacao;
    }
    public void imprimeConta(){
        System.out.println("Nro: " + getNumero());
        System.out.println("Estadou conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }

}
