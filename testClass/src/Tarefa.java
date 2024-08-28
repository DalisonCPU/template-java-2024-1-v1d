public class Tarefa {
    private String titulo;
    private String descricao;
    private Boolean completa;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.completa = false;
    }

    @Override
    public String toString() {
        if(completa) {
            return"[x] " + this.titulo + ". Arigato";
        }
        return "[ ]";
    }

    public void completar() {
        this.completa = true;
    }
}
