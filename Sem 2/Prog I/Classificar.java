package ExerciciosDiversos;
import java.util.Scanner;
public class Classificar {
    public static void main(String[] args){
        try (Scanner Input = new Scanner(System.in)){
            double N1;
            double N2;
            double N3;
            System.out.println("Digite a nota da prova:");
            N1 = Input.nextDouble();
            System.out.println("Digite a nota da prova:");
            N2 = Input.nextDouble();
            System.out.println("Digite a nota da prova:");
            N3 = Input.nextDouble();
            if(N1 <= 7 && N2 <= 7 && N3 <= 7){
                System.out.println("Nivel C");
            }
            else if(N1 > 7 && N2 > 7 || N2 > 7 && N3 > 7 || N3 > 7 && N1 > 7){
                System.out.println("Nivel A");
            }
            else{
                System.out.println("Nivel B");
            }
            
        }
    }
}
