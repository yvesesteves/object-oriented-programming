import java.time.LocalDate;
import java.io.Serializable;
public abstract class Pessoa implements Serializable {
    //private static final long serialVersionUID = 12345;
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private String estadoCivil;
    private String endereco;
    private String sexo;

    public Pessoa(String nome, String cpf, LocalDate dataNasc, String estadoCivil, String endereco, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
