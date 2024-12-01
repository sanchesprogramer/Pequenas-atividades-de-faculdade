import java.util.Scanner;
public class Aula2Alt {
    public static void main(String[] args){
        int number;
        int newnumber;
        String[] Responses = {"Hoje tem fantástico", "Que preguiça...", "Está chegando a metade", "Posso ver a luz no fim do tunel", "Agora sim!", "M-A-R-A-V-I-L-H-A", "Ufa! Chegou o sábado"};
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Descubra a mensagem do dia!");
            System.out.print("Digite um numero entre 1 e 7, ou 0 para sair.");
            number = entrada.nextInt();
            while (number != 0 ){
                if (number >= 1 && number <= 7){
                    System.out.println(Responses[number-1]);
                }
                else{
                    System.out.println("Numero Invalido.");
                }
                System.out.println("Digite um numero entre 1 e 7, ou 0 para sair.");
                newnumber = entrada.nextInt();
                number = newnumber;
            } 
        }
        System.out.println("Programa encerrado com sucesso.");
        }    
    }

    

