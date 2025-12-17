package leitor_condicional_nelio;

import java.util.Scanner;
// Condicionais || OU
public class leitor2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" 2+2? :");
        int RE1 = scan.nextInt();
        scan.nextLine();

        System.out.println(" 10 x 10? :");
        int RE2 = scan.nextInt();
        scan.nextLine();

        System.out.println("30 - 100? :");
        int RE3 = scan.nextInt();
        scan.nextLine();

        if (RE1 != 4 || RE2 != 200 || RE3 != 70)
            System.out.println("você falhou, tente de novo!");
        else System.out.println(" parabens");
    }
}
