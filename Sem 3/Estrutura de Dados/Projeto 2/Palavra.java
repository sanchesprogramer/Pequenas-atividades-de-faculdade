public class Palavra{
  String palavra;
  int ocorrencias;
  public Palavra(){
    
  }
  public Palavra(String x, int y){
    this.palavra = x;
    this.ocorrencias = y;
  }
  public String getPalavra(){
    return this.palavra;
  }
  public int getOcorrencia(){
    return this.ocorrencias;
  }
}