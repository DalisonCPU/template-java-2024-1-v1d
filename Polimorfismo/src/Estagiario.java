public class Estagiario extends  Aluno{
    private String bolsa;

    public Estagiario(String nome, int id, String senha, String curso, String bolsa) {
        super(nome, id, senha, curso);
        this.bolsa = bolsa;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
}
