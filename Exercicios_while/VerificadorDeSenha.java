package Exercicios_while;
import java.util.Scanner;

public class VerificadorDeSenha {
    public static void main (String[]args){
        System.out.println("bem-vindo ao Wise Maneger! ");
        System.out.println("Insira a senha para prosseguir:");

        Scanner scan = new Scanner(System.in);
        int senha = scan.nextInt();

        while (senha != 225){
            System.out.println("Acesso negado!!!");
            senha = scan.nextInt();


        }
        scan.close();
        System.out.println("Acesso permitido!");
    }
}
