package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // atributo
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = buscarTarefaPorDescricao(descricao);
        if (tarefaParaRemover != null) {
            tarefas.remove(tarefaParaRemover);
        }
    }
}
