public class Esfera extends FormaTridimensional{
    private double raio;
    public Esfera(double raio) {
        super("Esfera");
        this.raio = raio;
    }
    @Override
    public double obterArea(){
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume(){
        return 4.0 / 3 * Math.PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return "Esfera (" +
                "raio = " + raio +
                ')';
    }
}
