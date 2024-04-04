import java.util.Scanner;

public class LeapYear {

    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a year to check:");

        int numberTyped = keyboard.nextInt();

        if(numberTyped %4 == 0 && numberTyped % 100 != 0 || numberTyped %400 == 0) {
            System.out.print("Year is leap.");
        } else {
            System.out.print("The typed year not is leap.");
        }
    }
}