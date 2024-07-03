package ads.poo;

import java.time.LocalDate;

public class Tarefa {
    private String id;
    private String titulo;
    private LocalDate prazoConclusao;
    private List<Pessoa> pessoas;

    public Tarefa(String id, String titulo, LocalDate prazoEntrega, LocalDate prazoConclusao, List<Pessoa> pessoas) {
        this.id = id;
        this.titulo = titulo;
        this.prazoConclusao = prazoConclusao;
    }
    

}
