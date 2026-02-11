public class principal {

    public static void main(String[] args) {
      Aluno aluno = new Aluno();
      aluno.nome="Antonio";
      aluno.idade=25;
      aluno.setMensalidade(1000);
      aluno.ExibirDados();
      double novoValor = aluno.CalMains(10);
      
    }
    
}
