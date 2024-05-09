public class Passaro extends Animal {
    private boolean voando;

    public Passaro(String nomeAnimal, int idade, String raca, String tipo, boolean voando) {
        super(nomeAnimal, idade, raca, tipo);
        this.voando = voando;
    }


    @Override
    public String mostraInformacoes() {
        String infos = super.mostraInformacoes();
        infos += " Esta " + this.tipo+ " está " + (this.voando? "parada" : "voando");
                return infos;
    }

    public void voa() {
        this.voando = true;
        System.out.println("O " + this.nomeAnimal+ " levanta voo.");
    }

    public void pousa() {
        System.out.println("O " +this.nomeAnimal+ " pousa após um longo período de voo.");
    }

    public void botaOvo() {
        System.out.println(this.nomeAnimal+ "põe um ovo.");
    }
}
