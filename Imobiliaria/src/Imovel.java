public class Imovel {
    private String endereco;
    private int area;
    private int numeroDeQuartos;
    private int id;
    private int tipo;

    public Imovel(String endereco, int area, int numeroDeQuartos, int id, int tipo) {
        this.endereco = endereco;
        this.area = area;
        this.numeroDeQuartos = numeroDeQuartos;
        this.id = id;
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
