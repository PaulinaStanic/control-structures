import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        int seniority;
        int seniorityBond = 0;
        int salary;
        int salaryBond = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la antigüedad: ");
        seniority = keyboard.nextInt();

        System.out.println("Ingrese el sueldo: ");
        salary = keyboard.nextInt();

        if (seniority > 2) {
            seniorityBond = (salary * 20) / 100;
        } else if (seniority >= 5) {
            seniorityBond = (salary * 30) / 100;
        }

        if (salary > 3500) {
            salaryBond = (salary * 10) / 100;
        } else if (salary > 1000) {
            salaryBond = (salary * 15) / 100;
        } else {
            salaryBond = (salary * 25) / 100;
        }

        if (seniorityBond > salaryBond) {
            System.out.println("El sueldo total es: $" + (salary + seniorityBond));
        } else {
            System.out.println("El sueldo total es: $" + (salary + salaryBond));
        }
    }
}
