package ExerciciosDiversos;
import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            double saldo = 0;
            double TransactionType;
            double valor;
            do {
            System.out.println("Digite 1 para débito ou 2 para crédito, 0 para encerrar.");
            TransactionType = Input.nextInt();
            if (TransactionType == 0){
                break;
            }
            System.out.println("Digite o valor da quantia");
            valor = Input.nextDouble();
            
            if (TransactionType == 1){
                saldo = saldo - valor;
            }
            else{
                saldo = saldo + valor;
            }
            } while (TransactionType != 0);
            System.out.println("Saldo = " +saldo);
        }
    }
}
