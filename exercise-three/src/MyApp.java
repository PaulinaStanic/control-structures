import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        int amountOfMoney;
        String gift;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el dinero disponible: ");
        amountOfMoney = keyboard.nextInt();

        if (amountOfMoney >= 251) {
            gift = "Anillo";
        } else if (amountOfMoney >= 101) {
            gift = "Flores";
        } else if (amountOfMoney >= 11) {
            gift = "Chocolates";
        } else {
            gift = "Tarjeta";
        }

        System.out.println("El regalo puede ser: " + gift);
    }
}
