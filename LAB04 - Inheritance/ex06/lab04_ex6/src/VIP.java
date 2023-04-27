public class VIP extends Ingresso{
    double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        System.out.println("Ingresso VIP: ");
        return super.getValor() + this.valorAdicional;
    }

}
