import java.util.Scanner;
class Lab2AlturaPeso{
    public static void main(String[] args){
        int [] pesos = {0, 0, 0, 0, 0};
        int [] idades = {0, 0, 0, 0, 0};
        int pesoinput;
        int idadeinput;
        int media = 0;
        int counter = 0;
        try(Scanner peso = new Scanner(System.in)){
            try(Scanner idade = new Scanner(System.in)){
                System.out.println("Informe os pesos das 5 pessoas em sequência");
                for (int i = 0; i < pesos.length; i++){
                    pesoinput = peso.nextInt();
                    pesos[i] = pesoinput;
                    if (pesos[i] > 90){
                        counter = counter + 1;
                    }
                }
                System.out.println("Agora, informe a idade das 5 pessoas na mesma ordem");
                for (int i = 0; i < idades.length; i++){
                    idadeinput = idade.nextInt();
                    idades[i] = idadeinput;
                    media = media + idades[i];
                }
                media = media/5;
                System.out.println("A média de idade das pessoas é: " + media);
                System.out.println("A quantidade de pessoas com mais de 90kg é de: " + counter);
            }
        }
    }
}