public class Paciente{
    private String nome;
    private String CPF;
    private boolean Plano;
    private String Carteirinha;
    public Paciente(String nome, boolean plano, String Carteirinha, String CPF){
        this.nome = nome;
        this.Plano = plano;
        this.Carteirinha = Carteirinha;
        if(ValidaCPF(CPF) = true){
            this.CPF = CPF;
        }
    }
    public Paciente(String nome, String CPF){
        this.nome = nome;
        if(ValidaCPF(CPF) = true){
            this.CPF = CPF;
        }
    }
    public static String getCPF(){
        return this.CPF;
    }
    public static String getnome(){
        return this.nome
    }
    public static String getPlano(){
        return this.Plano
    }
    public static String getCarteirinha(){
        return this.Carteirinha;
    }
    public static Printer(){
        System.out.println("Nome: " +this.nome);
        System.out.println("CPF: " +this.CPF);
        System.out.println("Possui plano? " +this.Plano);
        System.out.println("# da Carteirinha: "+this.Carteirinha);
    }
    public static boolean ValidaCPF(String CPF) throws CPFException{
        boolean CPFValido = false;
        while(CPF.length != 11){
        throw new CPFException("O CPF deve conter somente 11 digitos");
        CPFEleitor = Input.next();
        for(int i = 0; i < Data.size(); i++){
        if (CPF.equals(Data.getCPF(i))){
            throw new CPFException ("CPF já cadastrado em sistema!"));
            CPFValido = false;
            break;
        }
        else{
            CPFValido = true;
            return CPFValido;
        }
    }
    }
}
}