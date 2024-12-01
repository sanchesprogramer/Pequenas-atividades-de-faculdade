public class FuncionarioComissionado extends Funcionario{
    private float vendas;
    private float percentual;
    private float Proventos;
public FuncionarioComissionado(String a, float b, float c, float d){
    super(a, b);
    vendas = c;
    percentual = d;
}
@Override
public float CalcularComissao(){
    percentual = (percentual/100)+1;
    float Comissao = percentual*vendas;
    Proventos = Comissao;
    return Proventos;
}
@Override
public float CalcularProventos(){
    Proventos= Proventos+super.getSalario();;
    return Proventos;

}
}