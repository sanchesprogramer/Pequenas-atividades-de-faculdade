public class SafeTest {
    public static void main(String[] args){
        Cofre Safe1 = new Cofre("Gabriel");
        Safe1.unlock();
        Safe1.Deposit10(5);
        Safe1.Deposit25(2);
        Safe1.Deposit50(10);
        System.out.println("Information on safe owned by "+Safe1.Owner);
        System.out.println("Amount of 10 cent coins: "+Safe1.Coins10);
        System.out.println("Amount of 25 cent coins: "+Safe1.Coins25);
        System.out.println("Amount of 50 cent coins: "+Safe1.Coins50);
        double amount = Safe1.CalcReal();
        System.out.println("Amount of money in R$: "+amount);
        double converted = Safe1.CalcDolar(2);
        System.out.println("Amount of money in $: "+converted);

    }
}
