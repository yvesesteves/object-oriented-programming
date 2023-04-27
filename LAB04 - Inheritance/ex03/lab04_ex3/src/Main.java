public class Main {
    public static void main(String[] args) {
        Figurinha f1 = new Figurinha("Neymar Jr.", "Atacante", "Brasil", "05/02/1992", 175, 68);
        FigurinhaExtra fe1 = new FigurinhaExtra("Pelé", "Atacante", "Brasil", "23/10/1940", 170, 70, "Legends", "Ouro");

        f1.mostrarFigurinha();
        fe1.mostrarFigurinha();
    }

}
