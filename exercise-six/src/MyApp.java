import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        double price;
        double discount;
        double total;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el precio del artículo: ");
        price = keyboard.nextDouble();

        if (price >= 200){
            discount = (price*15)/100;
        } else if (price >=100){
            discount = (price * 12)/100;
        } else {
            discount = (price*10)/100;
        }

        total = price - discount;

        System.out.println("El precio final es de: $" + total);
    }
}
