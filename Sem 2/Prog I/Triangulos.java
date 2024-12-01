package ExerciciosDiversos;
import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            int LadoINPUT;
            int L1;
            int L2;
            int L3;
            System.out.println("Digite o valor do lado: ");
            LadoINPUT = Input.nextInt();
            L1 = LadoINPUT;
            System.out.println("Digite o valor do lado: ");
            LadoINPUT = Input.nextInt();
            L2 = LadoINPUT;
            System.out.println("Digite o valor do lado: ");
            LadoINPUT = Input.nextInt();
            L3 = LadoINPUT;
            if(L1 > (L2 + L3) || L2 > (L1+L3) || L3 > (L1+L2)){
                System.out.println("Os Lados não formam um triangulo computável.");
            }
            else if (L1==L2 && L1 == L3){
                System.out.println("Triangulo Equilatero.");
            }
            else if (L1==L2 || L2 ==L3 || L3 == L1){
                System.out.println("Triangulo Isosceles");
            }
            else{
                System.out.println("Triangulo Escaleno.");
            }
            } 
        }
    }

