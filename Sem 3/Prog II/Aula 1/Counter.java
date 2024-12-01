public class Counter{
    private int c;
    public void Zero(){
        this.c = 0;
        System.out.println("Contador zerado.");
    }
    public void PlusOne(){
        this.c++;
    }
    public int Return(){
        return this.c;
    }   
}