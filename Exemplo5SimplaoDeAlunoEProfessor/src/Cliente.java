public class Cliente extends Pessoa {
    int produtosComprados;

    public Cliente(String nome, int id, String senha, int produtosComprados) {
        super(nome, id, senha);
        this.produtosComprados = produtosComprados;
    }

    public void compra(Fornecedor fornecedor, int quantidade) {
        fornecedor.vendeProdutos(this, quantidade);
    }
    public int getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(int produtosComprados) {
        this.produtosComprados = produtosComprados;
    }
}
