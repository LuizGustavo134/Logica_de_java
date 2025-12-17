package leitor_condicional_nelio;

import java.util.Scanner;
// Condicionais &&
public class leitor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quais as horas?  ");
        int horas = scan.nextInt();
        scan.nextLine();
        scan.close();
        if (horas == 30) {
            System.out.println("123");
        }
        else if (horas > 0 && horas <= 5)
            System.out.println("Madrugada");
        else if (horas >= 6 && horas <= 12)
            System.out.println("dia");
        else if (horas >= 13 && horas <= 18)
            System.out.println("tarde");
        else if (horas >= 19 && horas <= 23)
            System.out.println("noite");
        else if (horas == 0)
            System.out.println("meia noite");
        else if (horas == 12 )
            System.out.println("meio dia");

    }
}
