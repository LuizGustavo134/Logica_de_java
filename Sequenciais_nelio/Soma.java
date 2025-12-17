package Sequenciais_nelio;

import java.util.Scanner;

public class Soma {
    public static void main(String[]args){
        System.out.println("insira o primeiro numero :");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("insira o segundo numero :");
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("A soma é "+ (num1+num2));
    }
}
