// Classe do Modelo da Tarefa
class Tarefa {
    private String nome;
    private String descricao;
    private Projeto projeto;


    public Tarefa(String nome, String descricao, Projeto projeto) {
        this.nome = nome;
        this.descricao = descricao;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return nome + " - " + descricao + " (" + projeto.getNome() + ")";
    }
}
