public abstract class Funcionario{
    private String nome;
    private float salario;
    public Funcionario(String x, float y){
        nome = x;
        salario = y;
    }
    public float CalcularProventos(){
        return salario;
    }
    public String getNome(){
        return nome;
    }
    public float getSalario(){
        return salario;
    }
    public float CalcularComissao(){
        return 0;
    }
}