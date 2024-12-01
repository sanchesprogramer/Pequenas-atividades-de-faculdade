public class Main3 {
    public static boolean Checker(String[] x){
        String a = "";
        String b = "";
        boolean real = false;
        for(int i = 0; i < x.length; i++){
            a = a + x[i];
        }
        for(int i = x.length-1; i >=0; i--){
            b = b + x[i];
        }
        if(a.equals(b)){
            real = true;
            return real;
        }
        else{
            return real;
        }
    }
    public static void main(String[] args){
        String palavra[] = {"A", "B", "C", "D", "D", "C", "B", "A"};
        Checker(palavra);

    }
}