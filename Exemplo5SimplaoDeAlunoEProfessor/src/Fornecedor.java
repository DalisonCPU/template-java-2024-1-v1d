public class Fornecedor extends Pessoa {
    int produtos;

    public Fornecedor(String nome, int id, String senha, int produtos) {
        super(nome, id, senha);
        this.produtos = produtos;
    }

    public void adquireProdutos(int quantidade) {
        this.produtos += quantidade;
    }

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    public void vendeProdutos(Cliente cliente, int quantidade) {
        if(quantidade > produtos) {
            System.out.println("O fornecedor não tem produtos suficientes.");
            return;
        }
        cliente.setProdutosComprados(cliente.getProdutosComprados() + quantidade);
        this.produtos -= quantidade;
        System.out.printf("%s comprou %d de %s.", cliente.getNome(), quantidade, this.getNome());
    }
}
