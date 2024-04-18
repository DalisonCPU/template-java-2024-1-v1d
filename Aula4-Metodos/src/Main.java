import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> alunos = new ArrayList<Pessoa>();

        while(true) {
            String nome2 = JOptionPane.showInputDialog("Digite um nome:");
            System.out.println("Resultado de nome: " + nome2);

            if(nome2 == "" || nome2 == " ") {
                break;
            }
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            Pessoa p = new Pessoa();
            p.setNome(nome2);
            p.setIdade(idade);
            alunos.add(p);
        }

        System.out.printf("%d pessoas na lista:\r\n", alunos.size());

        for(int i = 0; i < alunos.size(); ++i) {
            System.out.println("Cadastro de notas para " + alunos.get(i).getNome());
            while (true) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota ou -1 para cancelar:"));
                if(nota < 0) break;

                alunos.get(i).addNota(nota);
            }
            System.out.printf("Notas cadastradas: %d. Média: %f.\r\n", alunos.get(i).notas.size(), alunos.get(i).getMedia());
        }
    }
}