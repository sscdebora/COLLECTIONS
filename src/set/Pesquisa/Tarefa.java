package set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false; // Por padrão, uma nova tarefa não está concluída
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + (concluida ? " (Concluída)" : " (Pendente)");
    }
}
