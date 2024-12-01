package ExerciciosDiversos;
import java.util.Scanner;
public class ProductRelation {
    public static void main(String[] args){
        String Products[] = {"Parafuso", "Porca", "Prego"};
        try(Scanner Input = new Scanner(System.in)){
            int ProductInput;
            System.out.println("Digite o numero do produto:");
            ProductInput = Input.nextInt();
            if (ProductInput > 3){
                System.out.println("Diversos");
            }
            else{
                for (int i = 0; i < 3; i++){
                    if(ProductInput == i){
                        System.out.println(Products[i-1]);
                        break;
                    }
                }
            }
            
            }
        }
    }
    

