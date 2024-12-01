import java.util.Scanner;
public class MenuPacientes{
    public static Scanner Input = new Scanner(System.in);
    public static void Options(){
        System.out.println("Menu - Sistema Hospital");
        System.out.println("1- Cadastrar Pacientes");
        System.out.println("2 - Listar Pacientes");
        System.out.println("3- Buscar Paciente por CPF");
        System.out.println("4 - Apagar Paciente");
        System.out.println("Opção Escolhida: ");
    }
    public static void Option1() throws CPFException{
        System.out.println("Digite o nome do Paciente:");
        String Nome = Input.next();
        System.out.println("Digite o CPF do Paciente:");
        String CPF = Input.next();
        System.out.println("O Paciente tem plano de saúde? Digite S para sim e N para não");
        String PlanoCheck = Input.next();
        if(PlanoCheck.equals("S")){
            System.out.println("Digite o número da carteirinha:");
            String Carteira = Input.next();
            boolean PlanOK = true;
            Paciente Teste = new Paciente(Nome, PlanOK, Carteira, CPF);
            Repositorio.Cadastrar(Teste);
        }
        else{
            Paciente Teste = new Paciente(Nome, CPF);
            Repositorio.Cadastrar(Teste);
        }
    }
    public static void Option2(){
        Repositorio.Printer();
    }
    public static void Option3(){
        System.out.println("Digite o CPF: ");
        String CPF = Input.next();
        Repositorio.Buscar(CPF);
    }
    public static void Option4(){
        System.out.println("Digite o CPF: ");
        String CPF = Input.next();
        Repositorio.Delete(CPF);
    }
}