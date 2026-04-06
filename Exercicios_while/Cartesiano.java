package Exercicios_while;
import java.util.Scanner;
public class Cartesiano {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("valor de 'x' : ");
        int x = scan.nextInt();
        System.out.println("valor de 'y' : ");
        int y = scan.nextInt();
        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("primeiro quadrante");
                System.out.println("##########################");
            }else if (x < 0 && y > 0){
                System.out.println("segundo quadrante");
                System.out.println("##########################");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
                System.out.println("##########################");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto quadrante");
                System.out.println("##########################");
            }
            System.out.println("valor de 'x' : ");
             x = scan.nextInt();
            System.out.println("valor de 'y' : ");
             y = scan.nextInt();
        }
    }}