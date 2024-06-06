public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo! Vamos negociar algumas casinhas, vamos vamos?");
        ImovelDeAluguel alugando = new ImovelDeAluguel("Rua dos Bobos número 0", 20, 2, 1, 1, 800, true);
        alugando.setValorAluguel(1400);
        alugando.alugar();

    }
}