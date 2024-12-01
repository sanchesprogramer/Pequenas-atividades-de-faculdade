import java.io.*;
import java.nio.*;
import java.util.ArrayList;
public class FReader{
  ArrayList<Palavra> Palavras = new ArrayList<Palavra>();
    public void ReadFile(){
    String path = "C:\\Temp\\aba.txt";
    //trocar a variável path pelo caminho local do arquivo produtos.txt
    File file = new File(path);{
    try {
    FileReader f = new FileReader(file);
    BufferedReader b = new BufferedReader(f);
    String line;
    while((line = b.readLine()) != null){
        String[] words = line.split(" "); 
      
        for (String word : words){
        Palavra p = new Palavra(word, 1);
        Palavras.add(p);
      }
    }
      
    b.close();
    } catch (IOException e) {
        System.out.println("Error reading file");
    }
    }
}
}
