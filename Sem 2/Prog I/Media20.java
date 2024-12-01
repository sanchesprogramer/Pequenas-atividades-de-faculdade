package ExerciciosDiversos;
import java.util.Scanner;
public class Media20 {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            int Numbers [] = new int[20];
            int counter = 0;
            int max = -1;
            int min = 1000000;
            double media = 0;
            while (counter < 20){
                System.out.println("Digite o numero");
                Numbers[counter] = Input.nextInt();
                if (Numbers[counter] > max){
                    max = Numbers[counter];
                }
                if (Numbers[counter] < min){
                    min = Numbers[counter];
                }
                media = media+Numbers[counter];
                counter++;
            }
            media = media/20;
            System.out.println("A media dos 20 numeros: " +media);
            System.out.println("O maior numero: " +max);
            System.out.println("O menor numero: " +min);
        }
    }
}
