// Classe do Controlador da Tarefa
class TarefaController {
    private Projeto projeto;
    private TarefaView view;

    public TarefaController(Projeto projeto) {
        this.projeto = projeto;
        this.view = new TarefaView(projeto);
    }
}
