public class Tetraedro extends FormaTridimensional{
    private double aresta;
    private double altura;
    public Tetraedro(double aresta, double altura){
        super("Tetraedro");
        this.aresta = aresta;
        this.altura = altura;
    }

    @Override
    public double obterArea(){
        return aresta * aresta * Math.sqrt(3);
    }

    @Override
    public double obterVolume(){
        return 1.0 / 3 * obterAreaBase() * altura;
    }
    private double obterAreaBase() {
        return aresta * aresta * Math.sqrt(3) / 4;
    }

    @Override
    public String toString() {
        return "Tetraedro(" +
                "aresta = " + aresta +
                ", altura = " + altura +
                ')';
    }
}
