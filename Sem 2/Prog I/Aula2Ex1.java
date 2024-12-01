import java.util.Scanner;
 public class Aula2Ex1 {
    public static void main(String[] args) {
        int number;
        int newnumber;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um numero entre 1 e 7, ou 0 para sair.");
            number = entrada.nextInt();
            while (number != 0 ){
                if (number == 1){
                    System.out.println("Hoje Tem Fantástico");}
                else if (number == 2){
                    System.out.println("Que preguiça...");
                }
                else if (number == 3){
                    System.out.println("Está chegando a metade...");
                }
                else if (number == 4){
                    System.out.println("Posso ver a luz no fim do tunel");
                }
                else if (number == 5){
                    System.out.println("Agora sim!");
                }
                else if (number == 6){
                    System.out.println("M-A-R-A-V-I-L-H-A");
                }
                else if (number == 7){
                    System.out.println("Ufa! Chegou o sábado");
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
