import javax.swing.*;
import java.util.ArrayList;

public class GerenciadorLoja {

    private ArrayList<Loja> lojas = new ArrayList<Loja>();


    public GerenciadorLoja() {
        this.geraDados();
    }

    public void mostraOpcoes() {
        while (true) {
            System.out.println("Escolha uma opção");
            System.out.println("1: Adicionar nova loja");
            System.out.println("2: Editar uma loja");
            System.out.println("3: Remover uma loja");
            System.out.println("4: Listar lojas");
            System.out.println("5: Sair");
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada:"));

            switch (opcao) {

                case 1: {
                    this.cadastra();
                    break;
                }

                case 2: {
                    this.editaLoja();
                    break;
                }

                case 3: {
                    this.removeLoja();
                    break;
                }

                case 4: {
                    this.mostraLojas(true);
                    break;
                }

                case 5: {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("Opção inválida.");
                    break;
                }
            }
        }
    }

    public void cadastra() {
        String nome = JOptionPane.showInputDialog("Qual o nome da loja à adicionar?");

        if (nome == "") {
            return;
        }

        String endereco = JOptionPane.showInputDialog("Qual o endereço da loja?");
        if (endereco == "") {
            return;
        }

        double telefone = Double.parseDouble(JOptionPane.showInputDialog("Qual o telefone da loja? (Somente números):"));
        if (telefone <= 0) {
            return;
        }

        Loja loja = new Loja(nome, endereco, telefone);
        this.lojas.add(loja);

        System.out.println("Loja adicionada");

    }


    public void mostraLojas(boolean informaTudo) {
        if (this.lojas.size() == 0) {
            System.out.println("Nenhuma loja cadastrada.");
        } else {

            for (int i = 0; i < this.lojas.size(); ++i) {
                if (informaTudo) {
                    System.out.printf("%d. %s: %s, %.0f\n", (i + 1), this.lojas.get(i).getNome(), this.lojas.get(i).getEndereco(), this.lojas.get(i).getTelefone());
                } else {
                    System.out.printf("%d. %s\n", (i + 1), this.lojas.get(i).getNome());
                }
            }
        }
    }


    public void removeLoja() {
        System.out.println("Escolha a loja que você deseja apagar");
        this.mostraLojas(false);

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da loja à apagar:"));
        opcao--;

        if (opcao < 0 || opcao >= lojas.size()) {
            System.out.println("Loja inválida.");
            return;
        }

        System.out.printf("Loja %s removida.\n", this.lojas.get(opcao).getNome());
        this.lojas.remove(opcao);
    }


    public void editaLoja() {
        System.out.println("Escolha a loja que você deseja editar:");
        this.mostraLojas(false);

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da loja que você deseja editar:"));
        opcao--;

        if (opcao < 0 || opcao >= this.lojas.size()) {
            System.out.println("Loja inválida.");
        } else {

            String endereco = JOptionPane.showInputDialog("Endereço da loja " + this.lojas.get(opcao).getNome() + ":", this.lojas.get(opcao).getEndereco());
            if (endereco == "") {
                System.out.println("Cancelado.");
                return;
            }

            double telefone = Double.parseDouble(JOptionPane.showInputDialog("Número da loja " + this.lojas.get(opcao).getNome() + ":", this.lojas.get(opcao).getTelefone()));

            if (telefone <= 0) {
                System.out.println("Cancelado.");
                return;
            }

            lojas.get(opcao).setEndereco(endereco);
            lojas.get(opcao).setTelefone(telefone);

            System.out.printf("Loja %s editada com sucesso.\n", this.lojas.get(opcao).getNome());
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