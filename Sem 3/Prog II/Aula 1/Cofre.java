import java.util.ArrayList;
public class Cofre {
    private double Money;
    private ArrayList<Moeda> Total = new ArrayList<Moeda>();

    public void adicionar(Moeda m){
      Total.add(m);
    }
    public double calcularTotal(){
        Money = 0;
        for(int i = 0; i < Total.size(); i++){
            Money = Money + Total.get(i).getValor();
    }
    return Money;
}
}
