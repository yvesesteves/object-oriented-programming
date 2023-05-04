public class Main {
    public static void main(String[] args){
        Forma[] formas = new Forma[]{
                new Circulo(5),
                new Triangulo(10,5),
                new Quadrado(5),
                new Esfera(10),
                new Cubo(6),
                new Tetraedro(4,6)
        };
        for (Forma forma : formas) {
            System.out.println(forma.getDescricao() + ": " + forma.toString());
            if (forma instanceof FormaBidimensional) {
                FormaBidimensional formaBidimensional = (FormaBidimensional) forma;
                System.out.println("Área: " + formaBidimensional.obterArea());
            } else if (forma instanceof FormaTridimensional) {
                FormaTridimensional formaTridimensional = (FormaTridimensional) forma;
                System.out.println("Área: " + formaTridimensional.obterArea());
                System.out.println("Volume: " + formaTridimensional.obterVolume());
            }
            System.out.println();
        }
    }
}
