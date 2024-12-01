public class Main {
    public static void main(String[] args){
        Counter c = new Counter();
        c.Zero();
        c.PlusOne();
        c.PlusOne();
        c.PlusOne();
        int A = c.Return();
        System.out.println(A);
    }
}
