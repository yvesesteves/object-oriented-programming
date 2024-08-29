import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;


class ProjetoView extends JFrame {
    private JTextField nomeProjetoTextField, descricaoProjetoTextField;
    private JButton adicionarProjetoButton, adicionarTarefaButton, removerProjetoButton, removerTarefaButton;
    JList<Projeto> projetosList;
    private DefaultListModel<Projeto> projetosListModel;
    private DefaultListModel<Tarefa> tarefasListModel;
    JList<Tarefa> tarefasList; // Correção aqui

    public ProjetoView() {
        setTitle("Gestão de Projetos Ágeis");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(3, 2));
        formularioPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        formularioPanel.add(new JLabel("Nome do Projeto:"));
        nomeProjetoTextField = new JTextField();
        formularioPanel.add(nomeProjetoTextField);

        formularioPanel.add(new JLabel("Descrição do Projeto:"));
        descricaoProjetoTextField = new JTextField();
        formularioPanel.add(descricaoProjetoTextField);

        adicionarProjetoButton = new JButton("Adicionar Projeto");
        formularioPanel.add(adicionarProjetoButton);

        panel.add(formularioPanel, BorderLayout.NORTH);

        projetosListModel = new DefaultListModel<>();
        projetosList = new JList<>(projetosListModel);
        JScrollPane projetosScrollPane = new JScrollPane(projetosList);
        panel.add(projetosScrollPane, BorderLayout.WEST);

        tarefasListModel = new DefaultListModel<>();
        tarefasList = new JList<>(tarefasListModel); // Correção aqui
        JScrollPane tarefasScrollPane = new JScrollPane(tarefasList);
        panel.add(tarefasScrollPane, BorderLayout.CENTER);

        JPanel botoesPanel = new JPanel(new FlowLayout());
        adicionarTarefaButton = new JButton("Adicionar Tarefa");
        removerProjetoButton = new JButton("Remover Projeto Selecionado");
        removerTarefaButton = new JButton("Remover Tarefa Selecionada");
        botoesPanel.add(adicionarTarefaButton);
        botoesPanel.add(removerProjetoButton);
        botoesPanel.add(removerTarefaButton);
        panel.add(botoesPanel, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }

    public String getNomeProjeto() {
        return nomeProjetoTextField.getText();
    }

    public String getDescricaoProjeto() {
        return descricaoProjetoTextField.getText();
    }

    public void addAdicionarProjetoListener(ActionListener listener) {
        adicionarProjetoButton.addActionListener(listener);
    }

    public void addAdicionarTarefaListener(ActionListener listener) {
        adicionarTarefaButton.addActionListener(listener);
    }

    public void addRemoverProjetoListener(ActionListener listener) {
        removerProjetoButton.addActionListener(listener);
    }

    public void addRemoverTarefaListener(ActionListener listener) {
        removerTarefaButton.addActionListener(listener);
    }

    public void adicionarProjetoNaLista(Projeto projeto) {
        projetosListModel.addElement(projeto);
    }

    public Projeto getProjetoSelecionado() {
        return projetosList.getSelectedValue();
    }

    public void adicionarTarefasNaLista(ArrayList<Tarefa> tarefas) {
        for (Tarefa tarefa : tarefas) {
            // Verifica se a tarefa já está na lista antes de adicionar
            if (!tarefasListModel.contains(tarefa)) {
                tarefasListModel.addElement(tarefa); // Adiciona a tarefa apenas se não estiver na lista
            }
        }
    }




    public Tarefa getTarefaSelecionada() {
        return tarefasList.getSelectedValue();
    }

    public void limparCamposProjeto() {
        nomeProjetoTextField.setText("");
        descricaoProjetoTextField.setText("");
    }
}