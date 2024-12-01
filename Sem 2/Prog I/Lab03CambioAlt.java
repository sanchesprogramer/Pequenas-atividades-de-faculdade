import java.util.Scanner;
public class Lab03CambioAlt {
    public static void main(String[] args){
        double CompraInput;
        int Currency;
        double ConvertedValue;
        double Currencies[][] = {{1, 2, 3}, {5.34, 6.27, 7.33}};
        String CurrencyList[] = {"Dolar", "Euro", "Libra"};
        try (Scanner moeda = new Scanner(System.in)) {
            try (Scanner CurrencyInput = new Scanner(System.in)){
                System.out.println("Digite o valor da compra internacional:");
            CompraInput = moeda.nextInt();
            System.out.println("Digite o tipo da moeda: 1 - dolar, 2 - euro ou 3 - libra: ");
            Currency = CurrencyInput.nextInt();
            for (int i = 0; i < 3; i++){
                if(Currency == Currencies[0][i]){
                    ConvertedValue = CompraInput*Currencies[1][i];
                    System.out.println("Tipo da moeda: " +CurrencyList[i]);
                    System.out.println("Valor da compra em R$: " +ConvertedValue);
                    }
                }
           
            }
        }
    }
}

