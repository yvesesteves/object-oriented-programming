import java.util.ArrayList;
import java.util.List;

public class Autor {
    private float peso;
    private String nome;
    private String dataNascimento;
    private List<Artigo> artigos;

    public Autor(float peso, String nome, String dataNascimento) {
        this.peso = peso;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.artigos = new ArrayList<>();
    }

    public float getPeso() {
        return peso;
    }


    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void login(){
        System.out.println("Bem vindo(a), " + this.nome + "!");
    }

    public void adicionarArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

}
