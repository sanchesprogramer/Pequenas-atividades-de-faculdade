//Felipe de Almeida Parreira 32211041
//Gabriel William Ribeiro Pauleti 32213948
//Raphael Dias Sanches 32273959
import java.util.*;
public class Main{
    public static FReader f = new FReader();
    Carrinho C;
    public static void main(String[] args){
        Scanner Input = new Scanner (System.in);
        f.ReadFile();
        int cod = 0;
        System.out.println("Lista de Produtos Disponíveis");
        for (int i = 0; i < f.ListaProdutos.size(); i++){
            System.out.println("Produto " + (i+1));
            System.out.println("Código: " + f.ListaProdutos.get(i).GetCodigo());
            System.out.println("Descrição: " + f.ListaProdutos.get(i).GetDesc());
            System.out.println("Preço: " + f.ListaProdutos.get(i).GetPreco());
        }
        System.out.println("Digite o codigo do produto, ou 99999 para finalizar: ");
        cod = Input.nextInt();
        do{
        System.out.println("Digite a quantidade desejada: ");
        int quant = Input.nextInt();
        f.Search(cod, quant);
        System.out.println("Digite o codigo do produto, ou 99999 para finalizar: ");
        cod = Input.nextInt();
        }while(cod != 99999);
        Carrinho C = new Carrinho(f.CartLoader, 10);
        System.out.println("Total da compra: "+C.somaValores());
        System.out.println("Total apos desconto aplicado: "+C.calcDesconto(C.valorPagar));
        C.MostraCarrinho();
    }
}