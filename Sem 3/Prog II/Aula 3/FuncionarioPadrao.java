public class FuncionarioPadrao extends Funcionario{
    public FuncionarioPadrao(String x, float y){
        super(x, y);
    }
    @Override
    public float CalcularProventos(){
        return super.getSalario(); 
    }
}