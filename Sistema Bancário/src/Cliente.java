
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
public class Cliente  extends Pessoa  {
    private String escolaridade;
    private Agencia agencia;
    private ArrayList<Conta> Contas;

    public Cliente(String nome, String cpf, LocalDate dataNasc, String estadoCivil, String endereco, String sexo, String escolaridade, Agencia agencia, Conta conta) {
        super(nome, cpf, dataNasc, estadoCivil, endereco, sexo);
        this.escolaridade = escolaridade;
        this.agencia = agencia;
        this.Contas = new ArrayList<>();;
    }

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, LocalDate data, String estadoCivil, String endereco, String sexo, String escolaridade, Agencia agencia) {
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public ArrayList<Conta> getContas() {
        return Contas;
    }

    public void setContas(Conta contas) {
        this.Contas.add(contas);
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }


}

