import java.io.*;
import java.nio.*;
import java.util.ArrayList;
public class FReader{
    ArrayList<Produto> ListaProdutos = new ArrayList<Produto>();
    public ArrayList<ItemCompra> CartLoader = new ArrayList<ItemCompra>();
    public void ReadFile(){
    String path = "C:\\Users\\gabri\\OneDrive\\Desktop\\Mackenzie S3\\Estrutura de Dados\\Projeto\\produtos.txt";
    //trocar a variável path pelo caminho local do arquivo produtos.txt
    File file = new File(path);{
    try {
    FileReader f = new FileReader(file);
    BufferedReader b = new BufferedReader(f);
    String line;
    while((line = b.readLine()) != null){
        String[] info = line.split(";");
        int x = Integer.parseInt(info[0]);
        String y = info[1];
        double z  = Double.parseDouble(info[2]);
        Produto p = new Produto(x, y, z);
        ListaProdutos.add(p);        

    }
    b.close();
    } catch (IOException e) {
        System.out.println("Error reading file");
    }
    }
}
    public void Search(int X, int A){
        for(int i = 0; i < ListaProdutos.size(); i++){
            if (X == ListaProdutos.get(i).GetCodigo()){
                ItemCompra I = new ItemCompra(A, ListaProdutos.get(i).GetDesc(),ListaProdutos.get(i).GetPreco());
                CartLoader.add(I);
            }
        }
    }
}

