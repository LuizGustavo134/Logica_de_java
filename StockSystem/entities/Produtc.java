package StockSystem.entities;

public class Produtc {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }
    public void AddProduct(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString (){
    return
            "Stock: "+
            name
            + " , $"
            + String.format("%.2f",price)
            + " , "
            + "Units: "
            +quantity
            + ", Total : "
            + String.format("%.2f",TotalValueInStock()  )
            ;
    }
}
