import java.util.Date;
public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.println(getNome() + "; " + getEndereco() + "; " + tipo + "; " + tituloDissertacao + ";");
        } else {
            System.out.println(getNome());
            System.out.println(getEndereco());
            System.out.println(tipo);
            System.out.println(tituloDissertacao);
            System.out.println("\n");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}
