import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese edad: ");
        age = keyboard.nextInt();

        if (age >= 16) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
    }
}
