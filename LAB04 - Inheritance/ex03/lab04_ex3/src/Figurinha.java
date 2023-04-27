public class Figurinha {
    private String  nome, posicao, pais, niver;
    private int altura, peso;

    private Figurinha FigurinhaExtra;

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

    public void mostrarFigurinha(){
        System.out.println("--Figurinha--");
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("País: " + this.pais);
        System.out.println("Data de nascimento: " + this.niver);
        System.out.println("Altura(cm): " + this.altura);
        System.out.println("Peso(kg): " + this.peso);
        System.out.println("\n");
    }

    public Figurinha(String nome, String posicao, String pais, String niver, int altura, int peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.niver = niver;
        this.altura = altura;
        this.peso = peso;
    }
}
