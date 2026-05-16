package AreaRetangulo.entities;

public class Retangulo {
    public int height;
    public int width;

    public double Area(){
         return (height * width);
    }
    public double perimeter(){
        return 2 * (height + width);
    }
    public double diagonal(){
        return Math.sqrt((height * height) + (width * width));
    }
    public String toString(){
        return "Area: " +
                String.format("%.2f",Area())
                + " ,"
                +" Perimeter: "
                + String.format("%.2f",perimeter())
                +" Diagonal: "
                +" A²= "
                +height
                +" B² = "
                +width
                + " =d² "
                +String.format("%.2f",diagonal());

    }

}
