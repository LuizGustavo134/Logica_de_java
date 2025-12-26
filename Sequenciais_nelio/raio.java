package Sequenciais_nelio;
import java.math.*;
import java.util.Scanner;

public class raio { public static void main(String[]args){
    // entrada de dados
    System.out.println("qual o valor do raio? :");
    Scanner scan = new Scanner(System.in);
    double raio = scan.nextInt();
    scan.nextLine();
    scan.close();

    // primeira parte do calculo
    double calc1 = Math.pow(raio,2);
    // segunda parte
    double calc2 = calc1 * Math.PI;
    // impressão de forma mais explicativa
    System.out.println(" Area = Pi * r² ");
    System.out.println(" Area = Pi * " + raio);
    System.out.println(" Area = Pi * "+ calc1);
    System.out.println("  Aproximadamente : ");
    System.out.printf ("  Area = %.1f%n ",calc2);
    // printf para formatar qual qualquer impressão de calculo ou similares
    // use a virgula e a variavel a ser formatada em seguida


}}
