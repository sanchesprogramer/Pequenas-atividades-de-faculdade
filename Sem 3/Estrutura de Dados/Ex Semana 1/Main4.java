public class Main4 {
    public static int Diagonal(int [][] x){
        int soma = 0;
        int i = 0;
        while (i < x.length){
            soma = soma + x[i][i];
            i++;

        }
        return soma;
    }
    public static void main(String[] args){
        int [][] Teste =  
        {{1, 0, 0, 0, 0},
        {0, 1, 0, 0, 0}, 
        {0, 0, 1, 0, 0}, 
        {0, 0, 0, 1, 0}, 
        {0, 0, 0, 0, 1},};
        //1,0 2,1 3,2 4,3 5,4
        int YEAH = Diagonal(Teste);
        System.out.println(YEAH);
    }
}
