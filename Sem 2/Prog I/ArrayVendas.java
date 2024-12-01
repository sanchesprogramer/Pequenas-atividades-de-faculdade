package ExerciciosDiversos;
import java.util.Scanner;
public class ArrayVendas {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            double Price[] = new double[10];
            double Sales[] = new double[10];
            int Valuable = 0;
            int Medium = 0;
            int Low = 0;
            for (int i = 0; i < 10; i++){
                System.out.println("Digite o custo do produto:");
                Price[i] = Input.nextDouble();
            }
            for (int i = 0; i < 10; i++){
                System.out.println("Digite a quanto ele foi vendido:");
                Sales[i] = Input.nextDouble();
            }
            for (int i = 0; i < 10; i++){
                if(Sales[i] < Price[i]*1.1){
                    Low++;
                }
                else if(Sales[i] > Price[i]*1.1 && Sales[i] < Price[i]*1.2){
                    Medium++;
                }
                else{
                    Valuable++;
                }
            }
            System.out.println("Produtos com menos de 10% de lucro: "+Low );
            System.out.println("Produtos lucrando entre 10 e 20%: " +Medium);
            System.out.println("Produtos que lucram mais que 20%: " +Valuable);
    }
}
}