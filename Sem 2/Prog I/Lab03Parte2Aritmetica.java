import java.util.Scanner;
public class Lab03Parte2Aritmetica {
    public static void main(String[] args){
        int Number1;
        int Number2;
        int Operation;
        double Output;
        try(Scanner N1Input = new Scanner(System.in)){
            try(Scanner N2Input = new Scanner(System.in)){
                try(Scanner OpInput = new Scanner(System.in)){
                    System.out.println("Digite o valor do Primeiro Numero");
                Number1 = N1Input.nextInt();
                System.out.println("Digite o valor do Segundo Numero");
                Number2 = N2Input.nextInt();
                System.out.println("Digite a operação desejada: 1 para média, 2 para multiplicação, 3 para diferença ou 4 para sair");
                Operation = OpInput.nextInt();
                    while (Operation != 4){
                        if (Operation == 1){
                            Output = (Number1+Number2)/2;
                            System.out.println("Media: " +Output);
                        }
                        else if(Operation == 2){
                            Output = Number1*Number2;
                            System.out.println("Produto: " +Output);
                        }
                        else if(Operation == 3){
                           if(Number1 > Number2){
                            Output = Number1-Number2;
                            System.out.println("Diferença: " +Output);
                           }
                           else{
                            Output = Number2-Number1;
                            System.out.println("Diferença: " +Output);
                           }
                        }
                        else if(Operation == 4){
                            break;
                        }
                        else{
                            System.out.println("Opção Inválida");
                        }
                        System.out.println("Digite a operação desejada: 1 para média, 2 para multiplicação, 3 para diferença ou 4 para sair");
                        Operation = OpInput.nextInt();
                    }
                    System.out.println("Programa encerrado.");
            }
            
        }
        }
    }
}
                
        
        
