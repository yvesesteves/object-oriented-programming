public class Quadrado extends FormaBidimensional{
    private double lado;
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }
    @Override
    public double obterArea(){
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado (" +
                "lado = " + lado +
                ')';
    }
}
