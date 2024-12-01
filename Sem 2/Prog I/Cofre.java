public class Cofre {
    String Owner;
    Boolean State;
    int Coins10;
    int Coins25;
    int Coins50;
public Cofre(String x){
    this.Owner = x;
}
public Cofre(){

}
public void lock(){
    this.State = false;
    System.out.println("This safe is now locked.");
}
public void unlock(){
    this.State = true;
    System.out.println("This safe is now unlocked.");
}
public void Deposit10(int a){
    this.Coins10 = this.Coins10 + a;
}
public void Deposit25(int b){
    this.Coins25 = this.Coins25+b;
}
public void Deposit50(int c){
    this.Coins50 = this.Coins50+c;
}
public double CalcReal(){
    double x = this.Coins10*0.1;
    double y = this.Coins25*0.25;
    double z = this.Coins50*0.5;
    double Total = x+y+z;
    return Total;
}
public double CalcDolar(double Exchange){
    double x = this.Coins10*0.1;
    double y = this.Coins25*0.25;
    double z = this.Coins50*0.5;
    double Inter = x+y+z;
    double total = Inter/Exchange;
    return total;

}
}
