package AreaRetangulo.aplication;

import java.util.Scanner;

import AreaRetangulo.entities.Retangulo;
import AreaRetangulo.entities.Retangulo.*;
public class main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo= new Retangulo();
        System.out.println("Enter Rectangle's height: ");
        retangulo.height = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Rectangle's width: ");
        retangulo.width= scan.nextInt();
        scan.nextLine();

        System.out.println();
        System.out.println(retangulo.toString());
    }
}
