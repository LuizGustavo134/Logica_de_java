package AdmissionSystem.entities;


public class employer {
    public String name;
    public String job;
    public double salary;
    public int increase;

    public String toString(){
        return
                "Employers: "+
                name
                +" ,"
                +job
                +" ,"
                +String.format("%.2f",salary);
    }
    public double increaseSalary() {
        return salary += ((this.salary /increase) * 100)+ salary;
    }
}
