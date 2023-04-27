public class FigurinhaExtra extends Figurinha{
    private String categoria, cor;
    public FigurinhaExtra(String nome, String posicao, String pais, String niver, int altura, int peso, String categoria, String cor) {
        super(nome, posicao, pais, niver, altura, peso);
        this.categoria = categoria;
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrarFigurinha(){
        System.out.println("--Figurinha Extra --");
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Cor: " + this.cor);
        super.mostrarFigurinha();
    }
}
