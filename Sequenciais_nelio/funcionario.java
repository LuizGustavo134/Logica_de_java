package Sequenciais_nelio;

import java.util.EmptyStackException;
import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        System.out.println("Informe o pagamento por hora:  ");
        Scanner scan = new Scanner(System.in);
        double pagamento = scan.nextDouble();
        scan.nextLine();


        System.out.println(" Horas trabalhadas? ");
        int horas = scan.nextInt();
        scan.nextLine();

        System.out.println(" dias trabalhados? ");
        int dias = scan.nextInt();
        scan.nextLine();


        double calculo1 = pagamento * horas;
        // calculo por dia

        double calculo2 = calculo1* dias;
        // calculo mensal

            System.out.println("Pagamento diario = "+ " "+ pagamento);
            System.out.printf("Saldo a receber por dia : %.4f%n", calculo1);
            System.out.println();
            System.out.printf("Salario mensal a receber: %.4f%n",calculo2);


    }
}
