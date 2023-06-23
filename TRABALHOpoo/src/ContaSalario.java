public class ContaSalario extends Conta{
    private double limiteSaque = 500.00;
    private double limiteTransferencia = 500.00;
    public ContaSalario(Agencia a, String numero, String senha, Cliente Dono) {
        super(a, numero, senha, Dono);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }
    public ContaSalario(Agencia a, String numero, String senha, Cliente Dono[]) {
        super(a, numero, senha, Dono);
        this.limiteSaque = limiteSaque;
        this.limiteTransferencia = limiteTransferencia;
    }



    //--------------------------------------------- SETS AND GETTERS --------------------------------------------------
    @Override
    public void imprimeConta(){
        System.out.println("Nro: " + getNumero());
        System.out.println("Estadou conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void setLimiteTransferencia(double limiteTransferencia) {
        this.limiteTransferencia = limiteTransferencia;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public double getLimiteTransferencia() {
        return limiteTransferencia;
    }
}
