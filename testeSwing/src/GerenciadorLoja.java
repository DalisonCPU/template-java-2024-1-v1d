import java.util.ArrayList;

public class GerenciadorLoja {

    private ArrayList<Loja> lojas = new ArrayList<Loja>();


    public GerenciadorLoja() {
        this.geraDados();
    }


    public ArrayList<Loja> getLojas() {
        return this.lojas;
    }

    public void cadastra(String nome, String endereco, double telefone) {
        if (nome == "") {
            return;
        }

        if (endereco == "") {
            return;
        }

        if (telefone <= 0) {
            return;
        }

        Loja loja = new Loja(nome, endereco, telefone);
        this.lojas.add(loja);


    }



    public void removeLoja(int opcao) {

        if (opcao < 0 || opcao >= lojas.size()) {
            return;
        }

        this.lojas.remove(opcao);
    }


    public void editaLoja(int opcao, String nome, String endereco, double telefone) {if (opcao < 0 || opcao >= this.lojas.size()) {
        return;
        } else {

            if (endereco == "") {
                return;
            }

            if (telefone <= 0) {
                System.out.println("Cancelado.");
                return;
            }

            lojas.get(opcao).setEndereco(endereco);
            lojas.get(opcao).setTelefone(telefone);

        }
    }


    public void geraDados() {

        for (int i = 0; i < 5; i++) {

            String fakeNome = randomizaString(5);
            String fakeEndereco = "Rua " + randomizaString(6) + ", " + randomizaString(2);
            double fakeTel = 12345678;

            Loja loja = new Loja(fakeNome, fakeEndereco, fakeTel);
            this.lojas.add(loja);
        }
    }


    private String randomizaString(int quantidade){

        String caracteres = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String finalString = "";

        for (int i = 0; i <= quantidade; ++i) {
            finalString += caracteres.charAt(random(0, caracteres.length() -1));
        }

        return finalString;
    }


    private int random ( int min, int max){
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }
}