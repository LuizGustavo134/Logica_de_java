package Sequenciais_nelio;

import java.util.Scanner;

public class diferença {
    public static void main(String[]args){
        System.out.println("insira os valores da expressão numérica");
        Scanner scan= new Scanner(System.in);
        System.out.println(" o valor de A: ");
        int A = scan.nextInt();
        scan.nextLine();

        System.out.println("o valor de  B: ");
        int B = scan.nextInt();
        scan.nextLine();

        System.out.println(" o valor de C: ");
        int C = scan.nextInt();
        scan.nextLine();

        System.out.println(" o valor de D: ");
        int D = scan.nextInt();
        scan.nextLine();
        scan.close();
        double m1 = A * B;
        double m2 = C * D;
        double m3 = m1 - m2;
        System.out.println("A * B ="+ " "+ m1);
        System.out.println("C * D ="+ " "+m2);
        System.out.println(m1+" - "+ m2);
        System.out.println(" A diferença é: ");
        System.out.printf("%.2f%n", m3);
    }
}
