public class Carro extends Veiculo {

    private int portas;

    public Carro(int rodas, int ano, String marca, String modelo, int portas) {
        super(rodas, ano, marca, modelo);

        this.portas = portas;
    }


    @Override
    public String toString() {
        return "Informações sobre o carro: " + super.toString()+" Quantidade de portas: " + portas+".\r\n";
    }

}