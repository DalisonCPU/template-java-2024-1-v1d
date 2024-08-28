public class Main {
    public static void main(String[] args) {

        Veiculo m = new Moto(2, 2023, "Honda", "CB 300F Twister");

        Moto moto2 = (Moto) m;
        if(moto2 instanceof  Moto) {
            System.out.println("Veículo convertido para moto.");
        }

        System.out.println(moto2.toString());
        moto2.empina();
    }
}