public class Animal {
    protected String nomeAnimal;
    protected int idade;
    protected String raca;
    protected String tipo;

    public Animal(String nomeAnimal, int idade, String raca, String tipo) {
        this.nomeAnimal = nomeAnimal;
        this.idade = idade;
        this.raca = raca;
        this.tipo = tipo;
    }

    public String mostraInformacoes() {
        return this.nomeAnimal + " da raça " + this.raca + ", com " + this.idade + " anos de idade, de classificação " + this.tipo+".";
    }
}
