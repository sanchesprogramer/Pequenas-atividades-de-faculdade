package ExerciciosDiversos;
import java.util.Scanner;
public class ProdutoPares {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            int Produto = 1;
            int Numero;
            do {
                System.out.println("Digite um numero inteiro positivo, ou 0 para encerrar");
                Numero = Input.nextInt();
                if(Numero == 0){
                    break;
                }
                else if(Numero%2 == 0){
                    Produto = Produto*Numero;
                }
            } while (Numero != 0);
            System.out.println("O produto dos numeros pares: " +Produto); 
        }
    }
    
}
