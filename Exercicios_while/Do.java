package Exercicios_while;
import java.util.Scanner;
public class Do {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String resposta;
        do {
            System.out.println("insira a primeira nota: ");
            int nota1 = scan.nextInt();
            scan.nextLine();
            System.out.println("insira a segunda nota: ");

            int nota2 = scan.nextInt();
            scan.nextLine();
            int res = nota1+nota2;
            System.out.println(res);

            System.out.println("deseja repetir?");
            resposta = scan.nextLine();


        }while (!resposta.equals("nao"));
        /* USE equals pra comparar strings ou
        (!resposta.equalsIgnoreCase("nao"));
        para Considerar a primeira letra "Nao"
         */

    }}