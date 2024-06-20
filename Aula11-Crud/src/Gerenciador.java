import javax.swing.*;
import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Avaliacao> avaliacoes = new ArrayList();

    void busca(String nomeBuscar, int tipo) {

        nomeBuscar = nomeBuscar.toLowerCase();

        for(Avaliacao result: avaliacoes) {

            String estabelecimento = result.getEstabelecimento().toLowerCase();
            String item = result.getItem().toLowerCase();

            if(nomeBuscar.equals("") || tipo == 1 && estabelecimento.contains(nomeBuscar) || tipo == 2 && item.contains(nomeBuscar)) {

                if(tipo == 1) {
                    System.out.println(result.getEstabelecimento());
                } else {
                    System.out.printf("%s comprado em %s. Nota: %s. Observação: %s\r\n", result.getItem(), result.getEstabelecimento(), result.getNota(), result.getComentario());
                }
            }
        }
    }

    public void addAvaliacao(String estabelecimento, String item, int nota, String observacao) {
        Avaliacao avaliacao = new Avaliacao(estabelecimento, item, nota, observacao);
        avaliacoes.add(avaliacao);
        System.out.println("Avaliação adicionada");
    }



    public void menu() {
        while (true) {
            System.out.println("1: Listar todos os estabelecimentos.\r\n2: Listar todos os itens.\r\n3: Buscar Estabelecimento\r\n4: Buscar item.\r\n5: Cadastrar item.\r\n6: Sair.");
            int opcao = Integer.parseInt(input("Escolha uma opção:"));
            switch (opcao) {
                case 1: // Listar estabelecimentos
                    busca("", 1);
                    break;
                case 2: // Listar itens
                    busca("", 2);
                    break;
                case 3: // Buscar estabelecimento
                    String estabelecimentoBuscar = input("Digite o nome do estabelecimento à buscar:");
                    busca(estabelecimentoBuscar, 1);
                    break;
                case 4: // Buscar item
                    String itemBuscar = input("Digite o nome do item à buscar:");
                    busca(itemBuscar, 2);
                    break;
                case 5: // Cadastrar item
                    String nomeEstabelecimento = input("Em qual estabelecimento esse item foi comprado?");
                    if(nomeEstabelecimento.equals("")) {
                        System.out.println("O nome do estabelecimento não pode ficar vazio");
                        return;
                    }

                    String nomeItem = input("Qual item você comprou?");
                    if(nomeItem.equals("")) {
                        System.out.println("O nome do item não pode ficar vazio.");
                        return;
                    }

                    int notaItem = Integer.parseInt(input("Nota para o produto(1 - 5):"));
                    if(notaItem <1 || notaItem > 5) {
                        System.out.println("A nota para o item deve ser de 1 à 5.");
                        return;
                    }

                    String comentario = input("Digite sua observação para o item:");
                    if(comentario.equals("")) {
                        System.out.println("A observação não pode ficar vasia.");
                        return;
                    } else if (comentario.length() < 20) {
                        System.out.println("A observação precisa ter, no mínimo, 20 caracteres.");
                        return;
                    } else {
                        addAvaliacao(nomeEstabelecimento, nomeItem, notaItem, comentario);
                        System.out.println("Avaliação cadastrada!");
                    }
                    break;
                case 6:
                    System.out.println("Fim.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    String input(String mensagem) {

        return JOptionPane.showInputDialog(mensagem);

    }


   public void geraFakes() {
       Avaliacao avaliacao1 = new Avaliacao("Pizzaria do João", "Pizza de Calabresa", 4, "Pizza saborosa e bem servida");
       Avaliacao avaliacao2 = new Avaliacao("Restaurante da Maria", "Pizza Quatro Queijos", 5, "Queijos deliciosos e bem gratinados");
       Avaliacao avaliacao3 = new Avaliacao("Churrascaria da Ana", "Picanha na Brasa", 2, "A carne estava dura e sem sabor");
       Avaliacao avaliacao4 = new Avaliacao("Cafeteria do Carlos", "Café Expresso", 1, "Café muito amargo e mal feito");

       avaliacoes.add(avaliacao1);
       avaliacoes.add(avaliacao2);
       avaliacoes.add(avaliacao3);
       avaliacoes.add(avaliacao4);
   }
}