package StudentNotes.entities;

public class Student {
    public String name = "alex";
    public double note1,note2,note3;
    public double media;
    public double meta = 100;


    public double mediaNotes(){
        return media = ((note1 + note2 + note3)/ 3);
    }
    public String FinalResult(){
        if (media >= 60){
           return "PASS";

        } else if (media <= 59) {
            double LostPoint = (meta-media);
            return  "FAILED"+" Missing: "+LostPoint+", points";

        }
        return FinalResult();
    }
    public String toString(){
        return
                name
                +", "
                +String.format("%.2f",mediaNotes())
                +", "
                +FinalResult();
    }
}

