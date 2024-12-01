package ExerciciosDiversos;
import java.util.Scanner;
public class Divisao {
    public static void main(String[] args){
        int numX;
        int numY;
        double result1;
        double result2;
        try(Scanner X = new Scanner(System.in)){
            try(Scanner Y = new Scanner(System.in)){
                System.out.println("Digite o primeiro numero inteiro");
                numX = X.nextInt();
                System.out.println("Digite o segundo numero inteiro");
                numY = Y.nextInt();
                result1 = numX/numY;
                result2 = numX%numY;
                System.out.println("O resultado da divisão do primeiro pelo segundo é de " + result1);
                System.out.println("O resto da divisão do primeiro pelo segundo é de " +result2);

    }
}
}
}