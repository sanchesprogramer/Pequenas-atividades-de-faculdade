package ExerciciosDiversos;
import java.util.Scanner;
public class MediaPesos {
    public static void main(String[] args){
        try(Scanner NotaInput = new Scanner(System.in)){
            try (Scanner Faltas = new Scanner(System.in)){
                try (Scanner Total = new Scanner(System.in)){
                    double NotasInter [] = {0, 0, 0, 0};
                    double Pesos [] = {0.3, 0.5, 0.1, 0.1};
                    double NotaFinal[] = {0, 0, 0, 0};
                    double TotalAulas;
                    double FaltasINPUT;
                    double Assistidas = 0;
                    double media = 0;
                    System.out.println("Digite o total de aulas no curso: ");
                    TotalAulas = Total.nextDouble();
                    System.out.println("Digite o numero de aulas assistidas: ");
                    FaltasINPUT = Faltas.nextDouble();
                    Assistidas = FaltasINPUT/TotalAulas;
                    Assistidas = Assistidas*100;
                    System.out.println("Digite a nota da prova 1: ");
                    NotasInter[0] = NotaInput.nextDouble();                      
                    System.out.println("Digite a nota do prova 2: ");
                    NotasInter[1] = NotaInput.nextDouble();
                    System.out.println("Digite a nota do trabalho 1: ");
                    NotasInter[2] = NotaInput.nextDouble();
                    System.out.println("Digite a nota do trabalho 2: ");
                    NotasInter[3] = NotaInput.nextDouble();
                    for (int i = 0; i < 4; i++){
                        NotaFinal[i] = NotasInter[i] * Pesos[i];
                        media = media + NotaFinal[i];
                    }                                          
                    System.out.println("Media = " +media);
                    System.out.println("Frequencia = " +Assistidas +"%");

                }
            }
            
        }
    }
}

