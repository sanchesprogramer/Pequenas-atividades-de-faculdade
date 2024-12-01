package ExerciciosDiversos;
import java.util.Scanner;
public class IPVA {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            double ValorNota;
            double MesCompra;
            double ValorFinal;
            System.out.println("Digite o valor da nota fiscal:");
            ValorNota = Input.nextInt();
            System.out.println("Digite o mes da compra:");
            MesCompra = Input.nextInt();
            ValorFinal = ValorNota*0.04/12*(MesCompra+1);
            System.out.println("Valor do IPVA = " +ValorFinal);
        }
    }
}
