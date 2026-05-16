package AreaRetangulo.entities;

public class Retangulo {
    public int altura;
    public int largura;

    public double Area(){
         return (altura * largura);
    }
    public double perimetro(){
        return 2 * (altura + largura);
    }
    public double diagonal(){
        return Math.sqrt((altura * altura) + (largura * largura));
    }
    public String toString(){
        return "Area: " +
                String.format("%.2f",Area())
                + " ,"
                +" Perimetro: "
                + String.format("%.2f",perimetro())
                +" Diagonal: "
                +" A²= "
                +altura
                +" B² = "
                +largura
                + " =d² "
                +String.format("%.2f",diagonal());

    }

}
