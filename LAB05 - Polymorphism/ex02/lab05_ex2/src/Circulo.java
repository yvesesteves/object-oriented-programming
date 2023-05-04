public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double obterArea(){
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo (" +
                "raio = " + raio +
                ')';
    }
}
