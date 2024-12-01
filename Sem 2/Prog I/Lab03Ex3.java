import java.lang.reflect.Array;

import Java.util.Scanner;
public class Lab03Ex3 {
    public static double entrada(){
        double x = System.out.println("Digite o preço: ");
        return x;
    }
    public static double mediaPrecos(double x){
        double y = x/20;
        return y;
    }
    public static double contaLojas(array x, double y){
        double counter = 0;
        for (int i = 0; i < 20; i++){
           if(x[i] > y ){
            counter++;
           }     
        }
        return counter;
    }
    public static void main(String[] args){
        double Precos[] = new double [20];
        double inter = 0;
        System.out.println("Entrada dos valores de preço.");
        try(Scanner Input = new Scanner(System.in)){
            for (int i = 0; i < 20; i++){
                Precos[i] = entrada();
                inter = inter + Precos[i];
            }
            double media = mediaPrecos(inter);
            double QtdMaior = contaLojas(Precos, media);
            System.out.println("Preço media do produto: " +media);
            System.out.println("Quantidade de lojas com o preço acima da média: " +QtdMaior);
        }
        
    }
}
