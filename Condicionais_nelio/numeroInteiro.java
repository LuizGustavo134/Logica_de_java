package Condicionais_nelio;

import java.util.Scanner;
// Fazer um programa para ler um número inteiro,
// e depois dizer se este número é negativo ou não.
public class numeroInteiro {
    public static void main (String[]args){
        System.out.println("Insira um numero: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        scan.nextLine();
        if (num1 > 0 )
            System.out.println("positivo");
        else if (num1 < 0 )
            System.out.println(" negativo");
        else
            System.out.println("nulo");
    }
}
