import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        double amountOfHours;
        double total = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas: ");
        amountOfHours = keyboard.nextDouble();

        if (amountOfHours > 10) {
            total = amountOfHours * 2;
        } else if (amountOfHours <= 10 && amountOfHours > 5) {
            total = (2 * 5) + (3 * 4) + (5 * 3);
        } else if (amountOfHours <= 5 && amountOfHours > 2) {
            total = (2 * 5) + (3 * 4);
        } else if (amountOfHours <= 2) {
            total = amountOfHours * 5;
        }

        System.out.println("El total a pagar es: $" + total);

    }
}
