package ProjEscola.src;
public class Aluno {
    public String nome;
    public int idade;
    private  double mensalidade; 
    
    public double CalMains (double desc){
     double novaMens = this.mensalidade-this.mensalidade*desc/100;
               return novaMens;
    }
     public void ExibirDados(){
    System.out.println (" nome: "+this.nome+" idade: "+this.idade+
            " mensalidade: "+this.mensalidade);
     }
     public double getMensalidade(){
         return this.mensalidade;
}
     public void setMensalidade(double mens){
         this.mensalidade = mens;
   
     }
    }
    
