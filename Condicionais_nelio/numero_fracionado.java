//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Condicionais_nelio;

import java.util.Locale;

public class numero_fracionado {
    public static void main(String[] args) {
        double x = 10.31904;
        String Nome = "Maria";
        int idade = 22;
        double salario = 2114.86;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultadao : " + x + " Metros");
        System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n", Nome, idade, salario);
    }
}
