package ExerciciosDiversos;
import java.util.Scanner;
public class CompraPeso {
    public static void main(String[] args){
        int ValorQuilo;
        int QTDCompra;
        double ValorPago;
        double troco;
        int ValorCompra;
        try(Scanner Quilos = new Scanner(System.in)){
            try (Scanner QTD = new Scanner (System.in)){
                try (Scanner Pago = new Scanner(System.in)){
                    System.out.println("Digite o valor de kg comprado: ");
                    QTDCompra = QTD.nextInt();
                    System.out.println("Digite o valor do kg: ");
                    ValorQuilo = QTD.nextInt();
                    System.out.println("Digite o valor pago: ");
                    ValorPago = QTD.nextInt();
                    ValorCompra = QTDCompra * ValorQuilo;
                    troco = ValorPago - ValorCompra;
                    System.out.println("O Valor total da compra é de: " +ValorCompra);
                    System.out.println("O troco a ser recebido é de " +troco);
                }
            }

        }
    }
}
