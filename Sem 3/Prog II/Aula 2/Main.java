import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        MenuPaicentes.Options();
        int Option = Input.nextInt();
         while(Option > 4 || Opcao < 1){
            System.out.println("Opção Inválida, favor digitar novamente.");
           MenuPacietntes.Options();
            Option = Input.nextInt();
            if(Option == 1){
                MenuPacientes.Option1();
            }
            else if(Option == 2){
                MenuPacientes.Option2();
            
            }
            else if(Option == 3){
                MenuPacientes.Option3();
            }
            else{
                MenuPacientes.Option4();
            }
        }
    }
}