package StudentNotes.entities;
public class Student {
    public String name = "alex";
    public double note1,note2,note3;
    public double media;
    public double meta = 100;
    public double minPoint = (60 * meta) / 100;

    public double mediaNotes(){
        return media = ((note1 + note2 + note3)/ 3);
    }
    public String FinalResult(){
        /*Nesse caso não consegui executar a logica e estruturar
        * o toString simultaneamente Acabei criando basicamente
         2 toString  diferentes que se juntam*/
        if (media >= minPoint){
           return "PASS"
                  +" congratulations!!! ";
        } else {
            double missingPoint = (minPoint - media );
            return " FAILED , Missing: "
                    +String.format("%.2f",missingPoint)
                    +" Required: 60 points to PASS";
        }
    }
    @Override
    public String toString(){
        return
                "Student: "+
                name
                +", "
                +"Score: "
                +String.format("%.2f",mediaNotes())
                +" "
                +"Status:"
                +FinalResult();
    }
}

