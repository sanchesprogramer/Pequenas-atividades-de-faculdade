import java.util.Scanner;
public class Lab03Parte2Cambio {
    public static void main(String[] args){
        double CompraInput;
        int Currency;
        double ConvertedValue;
        String ChosenCurrency = "null";
        try (Scanner moeda = new Scanner(System.in)) {
            try (Scanner CurrencyInput = new Scanner(System.in)){
                System.out.println("Digite o valor da compra internacional:");
            CompraInput = moeda.nextInt();
            System.out.println("Digite o tipo da moeda: 1 - dolar, 2 - euro ou 3 - libra: ");
            Currency = CurrencyInput.nextInt();
           if(Currency == 1){
            ChosenCurrency = "dolar americano";
            System.out.println("Tipo de moeda: " + ChosenCurrency);
            ConvertedValue = CompraInput*5.34;
            System.out.println("Valor da compra em R$ foi de: " +ConvertedValue);
           }
           if(Currency == 2){
            ChosenCurrency = "Euro";
            System.out.println("Tipo de moeda: " + ChosenCurrency);
            ConvertedValue = CompraInput*6.27;
            System.out.println("Valor da compra em R$ foi de: " +ConvertedValue);
           }
           if(Currency == 3){
            ChosenCurrency = "Libra";
            System.out.println("Tipo de moeda: " + ChosenCurrency);
            ConvertedValue = CompraInput*7.33;
            System.out.println("Valor da compra em R$ foi de: " +ConvertedValue);
           }
        }

        }
    }
}