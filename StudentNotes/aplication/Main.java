package StudentNotes.aplication;
import java.util.Locale;
import java.util.Scanner;
import StudentNotes.entities.Student;
public class Main {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        System.out.println("enter the with the Name and notes: ");
        student.name = scan.nextLine();
        student.note1 = scan.nextDouble();
        scan.nextLine();
        student.note2 = scan.nextDouble();
        scan.nextLine();
        student.note3 = scan.nextDouble();
        scan.nextLine();
        System.out.println(student);
        scan.close();

    }
}
