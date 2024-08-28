import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ListaDeTarefas listaTarefas = new ListaDeTarefas();

        Tarefa tarefa = new Tarefa("Acordar", "Hora de levantar safadinho");
        tarefa.completar();
        listaTarefas.adicionarTarefa(tarefa);
    }
}