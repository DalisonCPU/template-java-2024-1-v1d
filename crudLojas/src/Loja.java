public class Loja {
    private String nome;
    private String endereco;
    private double telefone; // para caber o número teve que ser double

    public Loja() {
        this.telefone = 0;
    }

    public Loja(String nome, String endereco, double telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTelefone() {
        return this.telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
}
