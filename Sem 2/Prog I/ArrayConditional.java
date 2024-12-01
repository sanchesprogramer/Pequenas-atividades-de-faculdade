package ExerciciosDiversos;
import java.util.Scanner;
public class ArrayConditional {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            int Initial[] = new int[11];
            int Final[] = new int[11];
            for (int i = 0; i < 11; i++){
                System.out.println("Digite um numero para o Vetor.");
                Initial[i] = Input.nextInt();
            }
            for (int i = 0; i < 11; i++){
                if (Initial[i]%2==0){
                    Final[i] = Initial[i]*5;
                }
                else{
                    Final[i] = Initial[i]+5;
                }
            }
            System.out.println("Vetor Inicial: ");
            for (int i = 0; i < 11; i++){
                System.out.print(Initial[i] + ",");
            }
            System.out.println("Vetor final: ");
            for (int i = 0; i < 11; i++){
                System.out.print(Final[i] + ",");
            }

        }
    }
}
