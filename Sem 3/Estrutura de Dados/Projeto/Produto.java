public class Produto {
    public int Codigo;
    public String Desc;
    public double Preco;
    public Produto(int x, String y, double z){
        this.Codigo = x;
        this.Desc = y;
        this.Preco = z;
    }
    public int GetCodigo(){
        return this.Codigo;
    }
    public String GetDesc(){
        return this.Desc;
    }
    public double GetPreco(){
        return this.Preco;
    }
}
