public class Cubo extends FormaTridimensional{
    private double lado;
    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }
    @Override
    public double obterArea(){
        return 6 * lado * lado;
    }

    @Override
    public double obterVolume(){
        return lado * lado * lado;
    }

    @Override
    public String toString() {
        return "Cubo(" +
                "lado = " + lado +
                ')';
    }
}
