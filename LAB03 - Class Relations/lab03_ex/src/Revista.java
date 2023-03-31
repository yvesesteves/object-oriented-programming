import java.util.ArrayList;
import java.util.List;

public class Revista {
    private String nome;
    private List<Artigo> artigosPublicados;

    public Revista(String nome) {
        this.nome = nome;
        this.artigosPublicados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void publicarArtigo(Artigo artigo) {
        artigosPublicados.add(artigo);
        System.out.println("Artigo " + artigo.getCodigo() + " publicado na revista " + nome);
    }

    public List<Artigo> getArtigosPublicados() {
        return artigosPublicados;
    }
}