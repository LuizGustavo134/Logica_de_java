package exercicio_for;
import java.util.Scanner;
public class contador {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("informe um valor :");
        int n = scan.nextInt();

        for (int i = 0; i<=n ; i++){
            System.out.println(i);
        }
    }
}
