package StockSystemV1.Aplication;
import StockSystemV1.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Product produtc = new Product();
        System.out.println("enter the product data");
        System.out.println("Name: ");
        produtc.name = scan.nextLine();

        System.out.println("price: ");
        produtc.price = scan.nextDouble();

        System.out.println("Quantity in stock: ");
        produtc.quantity =scan.nextInt();

        System.out.println(produtc);
        System.out.println();
        //No contexto de Um Sout não é necessário
        // especificar o product o ToString é chamado automaticamente

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
