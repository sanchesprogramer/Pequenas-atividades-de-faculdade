import java.util.*;
public class Carrinho {
    public ArrayList<ItemCompra> ListaItens;
    public double totalCompra;
    public double PorcDesconto;
    public double valorPagar;
    public Carrinho(ArrayList x, double y){
        this.ListaItens = x;
        this.PorcDesconto = y;
    }
    public void MostraCarrinho(){
        for(int i = 0; i < ListaItens.size(); i++){
            System.out.print(i+1+" : ");
            ListaItens.get(i).mostraItem();
        }
    }
    public double somaValores(){
        for (int i = 0; i < ListaItens.size(); i++){
            valorPagar= valorPagar+ListaItens.get(i).CalculaSubtotal();
        }
        return valorPagar;
    }
    public double calcDesconto(double x){
        PorcDesconto = PorcDesconto*0.01;
        x = x *(1-PorcDesconto);
        return x;
    }
}
