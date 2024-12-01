import java.util.Scanner;
public class Aula2Alt {
    public static void main(String[] args){
        int number;
        int newnumber;
        String printer;
        String printer2;
        String [][] Responses = { {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"},{"Hoje tem fantástico", "Que preguiça...", "Está chegando a metade", "Posso ver a luz no fim do túnel", "Agora sim", "M-A-R-A-V-I-L-H-A", "Ufa! Chegou o sábado!"} };
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Descubra a mensagem do dia!");
            System.out.println("Digite um numero entre 1 e 7, ou 0 para sair.");
            number = entrada.nextInt();
            while (number != 0 ){
                if (number >= 1 && number <= 7){
                    printer = Responses [0] [number-1];
                    printer2 = Responses[1] [number-1];
                    System.out.println("O dia da semana é: " + printer);
                    System.out.println("A mensagem do dia é: " + printer2);
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

    

