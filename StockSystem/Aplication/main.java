package StockSystem.Aplication;
import StockSystem.entities.Produtc;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produtc produtc = new Produtc();
        System.out.println("enter the product data");
        System.out.println("Name: ");
        produtc.name = scan.nextLine();

        System.out.println("price: ");
        produtc.price = scan.nextDouble();

        System.out.println("Quantity in stock: ");
        produtc.quantity =scan.nextInt();
        scan.close();
        System.out.println(produtc.name + " "+ produtc.price + " " + produtc.quantity);
    }
}
