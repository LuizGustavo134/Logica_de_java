package comutativa;

import java.util.Locale;
import java.util.Scanner;

public class comutativa {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println(" quantos minutos foram usados?");

        // 100 minutos disponiveis ao final será cobrado 50 reais
        // a cada minuto é cobrado um excedente de 2 reais a mais
        int minutos = scan.nextInt();
        scan.nextLine();

        double conta = 50.0;
        if ( minutos >= conta){
            // += é operador cumulativo
            conta += conta + (minutos - conta) * 2;
            System.out.printf("preço finsl é = %.2f%n",conta);
        }

    }
}
