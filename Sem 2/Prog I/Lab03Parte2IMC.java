import java.util.Scanner;
public class Lab03Parte2IMC {
    public static void main(String[] args){
        double[] IMC = {30, 24.9, 18.5, 0};
        String[] Relation = {"Obesidade", "Sobrepeso", "Peso Normal", "Abaixo do peso"};
        double altura;
        double peso;
        double IMCCalc;
        try(Scanner AlturaInput = new Scanner(System.in)){
            try(Scanner PesoInput = new Scanner(System.in)){
                System.out.println("Digite o peso da pessoa: ");
                peso = PesoInput.nextDouble();
                System.out.println("Digite a altura da pessoa: ");
                altura = AlturaInput.nextDouble();
                IMCCalc = peso/(altura*altura);
                for (int i = 0; i < 4; i++){
                    if(IMCCalc > IMC[i]){
                        System.out.println("Seu IMC é de: " + IMCCalc);
                        System.out.println("Você está com: " + Relation[i]);
                        break;
                    }
                }
            }
        }
    }
}
