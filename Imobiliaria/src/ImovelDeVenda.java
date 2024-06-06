public class ImovelDeVenda extends Imovel {
    private double precoVenda;

    public ImovelDeVenda(String endereco, int area, int numeroDeQuartos, int id, int tipo, double precoVenda) {
        super(endereco, area, numeroDeQuartos, id, tipo);
        this.precoVenda = precoVenda;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
