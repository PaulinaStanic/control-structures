import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        int hoursPerWeek;
        int extras;
        final int payPerHour = 100;
        int payment;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese cantidad de horas semanales: ");
        hoursPerWeek = keyboard.nextInt();

        if (hoursPerWeek > 40) {
            extras = hoursPerWeek - 40;
        } else {
            extras = 0;
        }

        payment = (hoursPerWeek * payPerHour) + (extras * payPerHour * 2);

        System.out.println("El pago semanal es: " + payment);
    }
}
