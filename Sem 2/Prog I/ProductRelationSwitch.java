package ExerciciosDiversos;
import java.util.Scanner;
public class ProductRelationSwitch {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            int Product;
            System.out.println("Digite o numero do produto:");
            Product = Input.nextInt();
            switch (Product){
                case 1:
                System.out.println("Parafuso");
                break;
                case 2:
                System.out.println("Porca");
                break;
                case 3:
                System.out.println("Prego");
                break;
                default:
                System.out.println("Diversos");
            }
        }
    }
}
