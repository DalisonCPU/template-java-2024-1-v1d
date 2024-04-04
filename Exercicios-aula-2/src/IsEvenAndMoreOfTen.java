import java.util.Scanner;

public class IsEvenAndMoreOfTen {

    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a number:");

        int numberTyped = keyboard.nextInt();

        String info;

        if (numberTyped % 2 == 0) {
            info = "O número é par";
        } else {
            info = "O número não é par";
        }

        info += " " + (numberTyped > 10 ? " e maior que 10" : "e menor ou igual à 10") + ".";

        System.out.print(info);
    }
}
