import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private int cod_tarefa;
    private String nome_tarefa;

    public int getCod_tarefa() {
        return cod_tarefa;
    }
    public String getNome_tarefa() {
        return nome_tarefa;
    }
    public void setCod_tarefa(int cod_tarefa) {
        this.cod_tarefa = cod_tarefa;
    }
    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    @Override
    public String toString() {
        return "Tarefas [código =" + cod_tarefa + ", Nome =" + nome_tarefa + "]";
    }
}
