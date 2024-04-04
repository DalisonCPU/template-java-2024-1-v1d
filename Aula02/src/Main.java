import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList pessoas = new ArrayList<Pessoa>();

        while(true) {


            System.out.println("Digite umnome:");

            String pergunta = teclado.nextLine();

            if (pergunta == "") {
                break;
            }

            Pessoa pessoa = new Pessoa(pergunta);
            pessoas.add(pessoa);
        }


        System.out.printf("Pessoas adicionadas: %d.", pessoas.size());
    }
}