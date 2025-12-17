//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Atividade01_nelio;

import java.util.Locale;

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
}
