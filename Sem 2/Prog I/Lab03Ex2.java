import java.util.Scanner;
public class Lab03Ex2 {
    public static double CtoF(double x){
        double y = (9*x/5)+32;
        return y;
    }
    public static double FtoC(double z){
        double w = 5*(z-32)/9;
        return w;
    }
    public static void main(String[] args){
        try(Scanner Input = new Scanner (System.in)){
            System.out.println("Digite 1 para converter de Fahrenheit para Celsius, ou 2 para converter de Celsius para Fahrenheit.");
            int Choice = Input.nextInt();
            while (Choice != 1 && Choice !=2){
                System.out.println("Opção inválida, tente novamente.");
                Choice = Input.nextInt();
            }
            if (Choice == 1){
                System.out.println("Digite o valor a ser convertido:");
                Double Value = Input.nextDouble();
                double Converted = FtoC(Value);
                System.out.println("Valor convertido: " +Converted);
            }
            else{
                System.out.println("Digite o valor a ser convertido:");
                Double Value = Input.nextDouble();
                double Converted = CtoF(Value);
                System.out.println("Valor convertido: " +Converted);
            }
        }
        
        
    }
}
