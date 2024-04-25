public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("David",  12345678, 100.0f);


        Conta c2 = new Conta("Phelipe", 11223344);



        boolean resultadoTranzacao = c1.transfere(c2, 50);

        if(resultadoTranzacao) {
            System.out.println("Operação realizada com sucesso.");
        } else {
        System.out.println("Ocorreu um erro inesperado.");
        }

        System.out.println("Saldo atual da conta de " + c1.getCliente()+": " + c1.getSaldo());



        
    }
}