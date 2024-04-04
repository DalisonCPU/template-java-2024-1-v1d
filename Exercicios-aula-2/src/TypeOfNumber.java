import java.util.Scanner;

public class TypeOfNumber {

    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a number:");

        int numberTyped = keyboard.nextInt();

        if(numberTyped < 0) {
            System.out.print("Negative");
        } else if(numberTyped == 0) {
                System.out.print("Zero");
            } else {
            System.out.print("Positive");
            }
        }
    }