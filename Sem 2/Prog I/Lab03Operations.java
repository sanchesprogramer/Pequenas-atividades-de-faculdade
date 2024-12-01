import java.util.Scanner;

import org.omg.CosNaming.NamingContextPackage.CannotProceedHelper;
public class Lab03Operations {
    public static double Addition (double x, double y){  
        return x+y;  
    }
    public static double Subtract (double x, double y){
        return x-y;
    }
    public static double Multiply (double x, double y){
        return x*y;
    }
    public static double divide (double x, double y, double A){
        if(y != 0){
            return x/y;
        }
        else{
           A = 1;
           return (A);
        }
    }
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            System.out.println("Digite o primeiro numero");
            double n1 = Input.nextDouble();
            System.out.println("Digite o segundo numero");
            double n2 = Input.nextDouble();
            double Catcher = 0;
            double Sum = Addition(n1, n2);
            double Sub = Subtract(n1, n2);
            double product= Multiply(n1, n2);
            double div = divide(n1, n2, Catcher);
            System.out.println("A soma dos dois numeros é: " +Sum);
            System.out.println("A diferença dos dois numeros é: " +Sub);
            System.out.println("O produto dos dois números é: " +product);
            if(Catcher!=1){
                System.out.println("Divisão:" +div);
            }
            else{
                System.out.println("Não é possível realizar a divisão por 0.");
            }
            

        }
    }
}
