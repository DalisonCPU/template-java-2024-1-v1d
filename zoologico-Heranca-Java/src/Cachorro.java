public class Cachorro extends Animal{
     private boolean latindo;
    public Cachorro(int idade, String raca, boolean latindo) {
        super("cachorro", idade, raca, "mamífero");
        this.latindo = latindo;
    }

    public void late() {
        this.latindo = true;
    }

    public void paraDeLatir() {
        this.latindo = false;
    }

    public void morde() {
        System.out.println("Oooops... Um " + this.raca + " te mordeu!");
    }

    public void pula(float altura) {
        if(altura <=1) {
            System.out.println("O " + this.raca+ " pulou bem baixinho...");
        } else if(altura >1 && altura <= 2) {
            System.out.println("Pela altura do pulo do " + this.raca+ ", ele parece ser de porte médio...");
        } else {
            System.out.println("Uau! Que cachorro grande... Ele pula bem alto!");
        }
    }

    @Override
    public String mostraInformacoes() {
        String infos = super.mostraInformacoes();
        infos += " Ele está " + (this.latindo? "latindo ": "quieto") + " neste momento.";
        return infos;
    }
}
