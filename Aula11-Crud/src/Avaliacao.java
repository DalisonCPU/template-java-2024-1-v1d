public class Avaliacao {
    private String estabelecimento;
    private String item;
    private int nota;
    private String comentario;

    public Avaliacao(String estabelecimento, String item, int nota, String comentario) {
        this.estabelecimento = estabelecimento;
        this.item = item;
        this.nota = nota;
        this.comentario = comentario;
    }


    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
