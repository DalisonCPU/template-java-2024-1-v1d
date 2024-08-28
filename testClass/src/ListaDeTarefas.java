import java.util.ArrayList;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        System.out.println("Tarefa adicionada.");
    }
}
