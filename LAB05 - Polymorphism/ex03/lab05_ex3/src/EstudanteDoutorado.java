import java.util.Date;
public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.println(getNome() + "; " + getEndereco() + "; " + tituloTese + ";");
        } else {
            System.out.println(getNome());
            System.out.println(getEndereco());
            System.out.println(tituloTese);
            System.out.println("\n");
        }
    }
    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}
