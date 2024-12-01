public class Produto{
    int Code;
    String Name;
    String Desc;
    double Value;
public void Construtor(int x, String y, String z){
    this.Name = y;
    this.Code =x;
    this.Desc = z;
}
public double AddTax(double TaxPercent, double value){
    double tax = TaxPercent/100;
    double Calc = Value*(1+tax);
    return Calc;
}
    public static void main(String[] args){
        Produto P1 = new Produto();
        P1.Construtor(1, "Messi", "Hexa");
        P1.Value = 1000;
        double tax = 10;
        double Taxed = P1.AddTax(tax, P1.Value);
        System.out.println("Custo após imposto: " +Taxed);
    }
}