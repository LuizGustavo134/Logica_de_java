package exercicio_for;
import java.util.Scanner;
public class calc_for {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("informe um valor: ");
        int z = scan.nextInt();
        int soma = 0;
        for (int i = 0; i < z; i++ ){
            System.out.println(" outro valor: ");
            int x = scan.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
    }
}
