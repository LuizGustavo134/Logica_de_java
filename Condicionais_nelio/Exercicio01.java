//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Condicionais_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String produtc1 = "computer";
        String produtc2 = "office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2450.47459;
        double price2 = (double)650.5F;
        double Measoure = 53.3401583066034;
        System.out.println("produtcs: ");
        System.out.printf("%s, which price is %.2f %n", produtc1, price1);
        System.out.printf("%s, which price is %.2f %n", produtc2, price2);
        System.out.printf("records: %d years old, code %d gender: %c  %n", age, code, gender);
        System.out.printf("Measoure with eight decimal places: %.8f %n", Measoure);
        System.out.printf("Rouded: (3 decimal places ): %.3f %n", Measoure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %.3f %n", Measoure);
    }

    // Condicionais || OU
    public static class leitor2 {
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

    // Condicionais &&
    public static class leitor1 {
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
}
