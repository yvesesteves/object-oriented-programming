import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Classe do Modelo
class Projeto {
    private String nome;
    private String descricao;
    private ArrayList<Tarefa> tarefas;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    @Override
    public String toString() {
        return nome + " - " + descricao;
    }

}