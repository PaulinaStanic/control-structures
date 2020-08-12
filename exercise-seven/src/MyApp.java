import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        int age;
        double average;
        int scolarship = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la edad del alumno: ");
        age = keyboard.nextInt();

        System.out.println("Ingrese el promedio del alumno: ");
        average = keyboard.nextDouble();

        if (age > 18){
            if (average >= 9){
                scolarship = 2000;
            } else if (average >= 7.5){
                scolarship = 1000;
            } else if (average >= 6){
                scolarship = 500;
            } else {
                System.out.println("Enviar carta para que estudie más el próximo semestre.");
            }
        } else {
            if (average >= 9){
                scolarship = 3000;
            } else if (average >= 8){
                scolarship = 2000;
            } else if (average >= 6){
                scolarship = 1000;
            } else {
                System.out.println("Enviar carta de invitación");
            }
        }

        System.out.println("La beca mensual del alumno será de: $" + scolarship);
    }
}
