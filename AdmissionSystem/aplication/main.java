package AdmissionSystem.aplication;

import java.util.Scanner;
import AdmissionSystem.entities.employer;
public class main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        employer worker = new employer();
        int MX = 1;
        do {
            System.out.println("Welcome to Admission Sytem what do want to do?");
            System.out.println("(1) ADD employer (2) Maneger paymant (3) See employer " +
                    "(4) exit");
                    int option = scan.nextInt();
                    scan.nextLine();
                    if (option == 1){
                     System.out.println("enter with the name: ");
                     worker.name =scan.nextLine();
                     System.out.println("Enter with the Job Function: ");
                     worker.job = scan.nextLine();
                     System.out.println("enter with the salary: ");
                     worker.Glossalary = scan.nextInt();
                     scan.nextLine();
                     worker.salaryTribute();
                        System.out.println("Employer Added");
                        System.out.println();

                    } else if (option == 2) {
                        System.out.println(worker);
                        System.out.println("What do you want to do?");
                        System.out.println("(1) change salary (2) increase salary ");
                        int r1 = scan.nextInt();
                        scan.nextLine();
                        if (r1 == 1){
                            System.out.println("enter with the salary: ");
                            worker.Glossalary = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Operation sucessfuly");
                        } else if (r1== 2) {
                            System.out.println("which porcentage to Increase? ");
                            worker.increase= scan.nextInt();
                            scan.nextLine();
                            worker.increaseSalary();
                            System.out.println("opration sucessfully");

                        }


                    } else if (option == 3) {
                        System.out.println();
                        System.out.println(worker);
                        System.out.println();

                    } else if (option ==4) {
                        MX += MX+1;
                    }
        }while (MX < 2);
    }
}
