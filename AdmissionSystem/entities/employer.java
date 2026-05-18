package AdmissionSystem.entities;


public class employer {
    public String name;
    public String job;
    public double Netsalary;
    public double Glossalary;
    public int increase;
    public double tribute = 7.14;

    public String toString(){
        return
                "Employers: "+
                name +" , "
                +job +" , "
                +"GrosSalary: "
                +Glossalary
                +", NetSalary "
                +String.format("%.2f",Netsalary)
                +", "
                +" Tribute: % "
                + tribute;
    }
    public double increaseSalary() {
        return Glossalary += ((this.Glossalary * increase) /100);
    }
    public double salaryTribute(){
        return Netsalary = Glossalary - ((tribute * Glossalary) / 100) ;
    }
}
