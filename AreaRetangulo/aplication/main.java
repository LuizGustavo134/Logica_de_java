package AreaRetangulo.aplication;

import java.util.Scanner;

import AreaRetangulo.entities.Retangulo;
import AreaRetangulo.entities.Retangulo.*;
public class main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Retangulo retangulo= new Retangulo();
        System.out.println("Entre com Altura do triangulo: ");
        retangulo.altura = scan.nextInt();
        scan.nextLine();

        System.out.println("Entre com a Largura do triangulo");
        retangulo.largura= scan.nextInt();
        scan.nextLine();

        System.out.println();
        System.out.println(retangulo.toString());
    }
}
