import java.util.Scanner;

public class TypeOfTriangle {

    public void start() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Primeiro lado do triângulo:");

        int lado1 = keyboard.nextInt();



        System.out.print("Segundo lado do triângulo:");

        int lado2 = keyboard.nextInt();



        System.out.print("Terceiro lado do triângulo:");

        int lado3 = keyboard.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.print("O triângulo é equilátero.");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.print("O triângulo é escaleno.");
        } else {
            System.out.print("O triângulo é isósceles.");
        }
    }
}