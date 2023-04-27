public class Ingresso {
    double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void escreveValor(){
        System.out.println("O valor do ingresso é de " + this.valor);
        System.out.println("\n");
    }

    public double getValor() {
        return valor;
    }
}
