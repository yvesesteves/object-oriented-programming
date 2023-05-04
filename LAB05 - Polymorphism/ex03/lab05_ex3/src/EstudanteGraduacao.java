import org.w3c.dom.ls.LSOutput;

import java.util.Date;
public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }
    @Override
    // método print sobrecarregado para imprimir em uma ou várias linhas
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.print(getNome() + "; "+ getEndereco() + "; " + tituloTCC + "; ");
            System.out.println("\n");
        } else {
            super.print(false);
            System.out.println(tituloTCC);
            System.out.println("\n");
        }
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
}
