public class Main{
    public static void main(String[] args){
        Funcionario F1 = new FuncionarioPadrao("Zeca", 750);
        Funcionario F2 = new FuncionarioComissionado("Juca", 100, 1000, 10);
        System.out.println(F1.getNome());
        System.out.println(F1.getSalario());
        System.out.println(F1.CalcularProventos());
        System.out.println(F2.getNome());
        System.out.println(F2.getSalario());
        System.out.println(F2.CalcularComissao());
        System.out.println(F2.CalcularProventos());
    }
}