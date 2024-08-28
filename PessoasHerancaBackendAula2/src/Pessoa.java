public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
