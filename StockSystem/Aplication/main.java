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

        System.out.println(produtc);
        System.out.println();
        //No contexto de UM Sout não é nece ssário
        // especificar o product pq só existe um metodo definido

        System.out.println("How much Units would you want to Add? ");
        int quantity = scan.nextInt();
        produtc.AddProduct(quantity);
        System.out.println();
        System.out.println("Update data sucesfuly");
        System.out.println(produtc);
        System.out.println();
        System.out.println("How much do you want to be removed?");
        quantity = scan.nextInt();
        produtc.RemoveProducts(quantity);
        System.out.println(produtc);
        scan.close();
    }
}
