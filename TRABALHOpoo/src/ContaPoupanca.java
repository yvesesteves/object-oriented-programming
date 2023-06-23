public class ContaPoupanca extends Conta{
    private double rendimento = 1.1;

    public ContaPoupanca(Agencia a, String numeroDaConta, String senha,Cliente dono){
        super(a,numeroDaConta,senha,dono);
    }
    public ContaPoupanca(Agencia a, String numeroDaConta, String senha,Cliente dono[]){
        super(a,numeroDaConta,senha,dono);

    }
    //--------------------------------------------- SETS AND GETTERS --------------------------------------------------
    @Override
    public void imprimeConta(){
        System.out.println("Nro: " + getNumero());
        System.out.println("Estadou conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }
}
