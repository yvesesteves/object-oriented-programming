public class Triangulo extends FormaBidimensional{
    private double base, altura;
    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double obterArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "Triangulo(" +
                "base = " + base +
                ", altura = " + altura +
                ')';
    }
}
