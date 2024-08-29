import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe da Visão da Tarefa
class TarefaView extends JFrame {
    private JTextField nomeTarefaTextField, descricaoTarefaTextField;
    private JButton adicionarTarefaButton;
    private Projeto projetoSelecionado;

    public void setProjetoSelecionado(Projeto projeto) {
        this.projetoSelecionado = projeto;
    }

    public Projeto getProjetoSelecionado() {
        return projetoSelecionado;
    }

    public TarefaView(Projeto projeto) {
        setTitle("Adicionar Tarefa");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Nome da Tarefa:"));
        nomeTarefaTextField = new JTextField();
        panel.add(nomeTarefaTextField);

        panel.add(new JLabel("Descrição da Tarefa:"));
        descricaoTarefaTextField = new JTextField();
        panel.add(descricaoTarefaTextField);

        adicionarTarefaButton = new JButton("Adicionar Tarefa");
        panel.add(adicionarTarefaButton);

        add(panel);

        setVisible(true);

        adicionarTarefaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTarefaTextField.getText();
                String descricao = descricaoTarefaTextField.getText();
                Projeto projetoSelecionado = getProjetoSelecionado(); // Obter o projeto selecionado
                if (projetoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "Nenhum projeto selecionado!");
                    return;
                }
                Tarefa tarefa = new Tarefa(nome, descricao, projetoSelecionado); // Passar o projeto selecionado
                projetoSelecionado.adicionarTarefa(tarefa);
                JOptionPane.showMessageDialog(null, "Tarefa adicionada ao projeto com sucesso!");
                dispose();
            }
        });

    }
}