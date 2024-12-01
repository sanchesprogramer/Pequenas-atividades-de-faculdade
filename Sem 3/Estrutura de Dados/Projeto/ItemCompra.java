public class ItemCompra {
    public int qtde;
    public String Desc;
    public double Preco;
    public ItemCompra(int x, String y, double z){
        this.qtde = x;
        this.Desc = y;
        this.Preco = z;
    }
    public int GetCodigo(){
        return this.qtde;
    }
    public String GetDesc(){
        return this.Desc;
    }
    public double GetPreco(){
        return this.Preco;
    }
    public double CalculaSubtotal(){
        return this.Preco*this.qtde;
    }
    public void mostraItem(){
        System.out.println("Descrição do produto: " +this.Desc + " Preço Unitário: " + this.Preco + " Subtotal: " + this.CalculaSubtotal());
    }
}
