import java.util.Scanner;

public class Division {

    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a number:");

        int numberTyped = keyboard.nextInt();

        if(numberTyped %5 == 0 && numberTyped %3 == 0) {
            System.out.print("Número válido.");

    } else {
            System.out.print("Número inválido.");
        }
}
}