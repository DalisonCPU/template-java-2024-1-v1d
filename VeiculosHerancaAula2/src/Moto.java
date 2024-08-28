public class Moto extends Veiculo {

    public Moto(int rodas, int ano, String marca, String modelo) {

        super(rodas, ano, marca, modelo);

    }

    @Override
    public String toString() {
        return "Informações sobre a moto " + super.toString()+"\r\n";
    }


    public void empina() {
        System.out.println("Empinando a moto!");
    }

}
