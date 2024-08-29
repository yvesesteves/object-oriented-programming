import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Classe do Controlador do Projeto
class ProjetoController {
    private ArrayList<Projeto> projetos;
    private ProjetoView view;

    public ProjetoController(ProjetoView view) {
        this.projetos = new ArrayList<>();
        this.view = view;

        this.view.addAdicionarProjetoListener(new AdicionarProjetoListener());
        this.view.addAdicionarTarefaListener(new AdicionarTarefaListener());
        this.view.addRemoverProjetoListener(new RemoverProjetoListener());
        this.view.addRemoverTarefaListener(new RemoverTarefaListener());
    }

    class AdicionarProjetoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = view.getNomeProjeto();
            String descricao = view.getDescricaoProjeto();
            Projeto projeto = new Projeto(nome, descricao);
            projetos.add(projeto);
            view.adicionarProjetoNaLista(projeto);
            JOptionPane.showMessageDialog(null, "Projeto adicionado com sucesso!");
            view.limparCamposProjeto();
        }
    }

    class AdicionarTarefaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Projeto projetoSelecionado = view.getProjetoSelecionado();
            if (projetoSelecionado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum projeto selecionado!");
                return;
            }
            String nome = JOptionPane.showInputDialog("Nome da Tarefa:");
            String descricao = JOptionPane.showInputDialog("Descrição da Tarefa:");
            Tarefa novaTarefa = new Tarefa(nome, descricao, projetoSelecionado);

            // Verifica se a tarefa já existe na lista de tarefas do projeto
            for (Tarefa tarefa : projetoSelecionado.getTarefas()) {
                if (tarefa.getNome().equals(novaTarefa.getNome()) && tarefa.getDescricao().equals(novaTarefa.getDescricao())) {
                    JOptionPane.showMessageDialog(null, "Esta tarefa já existe no projeto!");
                    return;
                }
            }

            projetoSelecionado.adicionarTarefa(novaTarefa);
            view.adicionarTarefasNaLista(projetoSelecionado.getTarefas());
            JOptionPane.showMessageDialog(null, "Tarefa adicionada ao projeto com sucesso!");
        }
    }




    class RemoverProjetoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Projeto projetoSelecionado = view.getProjetoSelecionado();
            if (projetoSelecionado == null) {
                JOptionPane.showMessageDialog(null, "Nenhum projeto selecionado!");
                return;
            }
            projetos.remove(projetoSelecionado);
            DefaultListModel<Projeto> model = (DefaultListModel<Projeto>) view.projetosList.getModel();
            model.removeElement(projetoSelecionado);
            JOptionPane.showMessageDialog(null, "Projeto removido com sucesso!");
        }
    }



    class RemoverTarefaListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Projeto projetoSelecionado = view.getProjetoSelecionado();
            Tarefa tarefaSelecionada = view.getTarefaSelecionada();
            if (projetoSelecionado == null || tarefaSelecionada == null) {
                JOptionPane.showMessageDialog(null, "Nenhum projeto ou tarefa selecionada!");
                return;
            }

            projetoSelecionado.removerTarefa(tarefaSelecionada);
            DefaultListModel<Tarefa> tarefasListModel = (DefaultListModel<Tarefa>) view.tarefasList.getModel();
            tarefasListModel.removeElement(tarefaSelecionada); // Remover a tarefa da lista na interface
            JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");
        }
    }



}


