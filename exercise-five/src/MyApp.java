import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        int ageOne;
        int ageTwo;
        int ageThree;
        String nameOne;
        String nameTwo;
        String nameThree;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre: ");
        nameOne = keyboard.next();

        System.out.println("Ingrese la edad: ");
        ageOne = keyboard.nextInt();

        System.out.println("Ingrese el segundo nombre: ");
        nameTwo = keyboard.next();

        System.out.println("Ingrese la edad: ");
        ageTwo = keyboard.nextInt();

        System.out.println("Ingrese el tercer nombre: ");
        nameThree = keyboard.next();

        System.out.println("Ingrese la edad: ");
        ageThree = keyboard.nextInt();

        if (ageOne > ageTwo && ageOne > ageThree){
            System.out.println("Le mayor es: " + nameOne + " con " + ageOne + " años.");
        } else if (ageTwo > ageOne && ageTwo > ageThree){
            System.out.println("Le mayor es: " + nameTwo + " con " + ageTwo + " años.");
        } else {
            System.out.println("Le mayor es: " + nameThree + " con " + ageThree + " años.");
        }


    }
}
