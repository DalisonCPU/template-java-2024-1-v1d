import java.util.Scanner;

public class Approved {

    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nota do aluno:");

        float nota = keyboard.nextFloat();

        System.out.print("Digite a frequência do aluno (porcentagem):");
        float porcentoFrequencia = keyboard.nextFloat();

        if(porcentoFrequencia >= 75.0 && nota >= 7.0) {
            System.out.print("Aprovado!");
        } else {
            System.out.print("Reprovado!");
    }
}
}