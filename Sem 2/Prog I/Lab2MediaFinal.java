import java.util.Scanner;
class Lab2MediaFinal{
    public static void main(String[] args){
        int media;
        int faltas;
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("Digite a media final");
            media = entrada.nextInt();
            System.out.println("Digite o numero de faltas");
            faltas = entrada.nextInt();
            if (media < 5 || faltas > 10){
                System.out.println("Aluno Reprovado! Lamento mas terá que estudar no próximo semestre");
            }
            else if (media >= 7 && faltas <= 10){
                System.out.println("Aluno Aprovado! Parabéns!");
            }
            else{
                System.out.println("Aluno deverá fazer a prova final.");
            }
        }   
    }
}