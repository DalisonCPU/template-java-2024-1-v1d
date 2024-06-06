public class ImovelDeAluguel extends Imovel {
    private double valorAluguel;
    private boolean disponibilidade;

    public ImovelDeAluguel(String endereco, int area, int numeroDeQuartos, int id, int tipo, double valorAluguel, boolean disponibilidade) {
        super(endereco, area, numeroDeQuartos, id, tipo);
        this.valorAluguel = valorAluguel;
        this.disponibilidade = disponibilidade;
    }

    public boolean alugar() {
        if(!this.disponivel()) {
            System.out.println("Imóvel já está alugado.");
            return false;
        }

        this.setDisponibilidade(false);
        System.out.printf("Imóvel alugado por R$ %.2f.", this.getValorAluguel());
        return true;
    }

    public void devolver() {
        if(this.disponivel()) {
            System.out.println("Imóvel já disponível.");
        } else {
            this.setDisponibilidade(true);
            System.out.println("Imóvel devolvido.");
        }
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public boolean disponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
