import java.util.ArrayList;

public class Pessoa {
    ArrayList<Nota> notas = new ArrayList<Nota>();
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }
    public Pessoa() {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void addNota(double valor) {
        Nota n = new Nota(valor);
        this.notas.add(n);
    }

    public double getMedia() {

        double valor = 0.0;
        int quantidadeNotas = 0;

        for(int i = 0; i < this.notas.size(); ++i) {

            valor += this.notas.get(i).getValor();
            quantidadeNotas++;

        }
        return valor / quantidadeNotas;
    }


}