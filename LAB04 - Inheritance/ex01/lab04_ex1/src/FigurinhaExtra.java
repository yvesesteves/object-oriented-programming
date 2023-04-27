public class FigurinhaExtra {
    private String  nome, posicao, pais, niver;
    private String categoria, cor;
    private int altura, peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNiver() {
        return niver;
    }

    public void setNiver(String niver) {
        this.niver = niver;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public FigurinhaExtra(String nome, String posicao, String pais, String niver, String categoria, String cor, int altura, int peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.niver = niver;
        this.categoria = categoria;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    public void mostrarFigurinha(){
        System.out.println("--Figurinha Extra--");
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("País: " + this.pais);
        System.out.println("Data de nascimento: " + this.niver);
        System.out.println("Altura(cm): " + this.altura);
        System.out.println("Peso(kg): " + this.peso);
        System.out.println("Categoria " + this.categoria);
        System.out.println("Cor: " + this.cor);
        System.out.println("-------");
        System.out.println("\n");
    }

}
