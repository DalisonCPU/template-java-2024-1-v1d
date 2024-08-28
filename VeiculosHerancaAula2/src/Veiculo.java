public class Veiculo {
    protected int rodas, ano;

    public Veiculo(int rodas, int ano, String marca, String modelo) {
        this.rodas = rodas;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    protected String marca, modelo;

    public String toString() {
        return marca+": Modelo: " + modelo+", ano: " + ano+". Quantidade de rodas: " + rodas+".";
    }

    public void numeroDeRodas() {
        System.out.println("Este veículo tem " + rodas);
    }

    public void trocaPneu(int qualRoda) throws Exception {
        if(qualRoda > rodas) {
            throw new Exception("Roda inválida para este veículo!");
        } else {
            System.out.println("Pneu trocado com sucesso!");
        }

    }
}
