import java.util.Random;
public class Ex5 {
    public static void main(String[] args){
        Random rand = new Random();
        int upperbound = 7;
        int[][] predio = new int [10][8];
        int Vazio = 0;
        int Maiorandar = 0;
        int Andar = 0;
        int ControleMaior = 0;
        int soma = 0;
        for (int i = 0; i < predio.length; i++){ //fill array
            for(int j = 0; j < predio[0].length; j++){
                predio[i][j] = rand.nextInt(upperbound);
            }
        }
        for (int i = 0; i < predio.length; i++){ //Actual code
            for(int j = 0; j < predio[0].length; j++){
                if(predio[i][j] == 0){
                    Vazio++;
                }
                soma = soma + predio[i][j]; 
                Maiorandar = Maiorandar + predio[i][j];
            }
            if (Maiorandar > ControleMaior){
                Maiorandar = ControleMaior;
                Andar = i+1;
                
            }
            Maiorandar = 0;
        }
        for (int i = 0; i < predio.length; i++){ //Print Array
            for(int j = 0; j < predio[0].length; j++){
                System.out.print(predio[i][j]);
            }
            System.out.println("");
        }
        System.out.println("O numero de aptos vazios e: " +Vazio);
        System.out.println("O andar que tem mais moradores e : "+Andar);
        System.out.println("O total de moradores e de : "+soma);
    }
}
