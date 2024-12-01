import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args){
        LocalDateTime rightnow = LocalDateTime.now();
        String DateString = rightnow.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        ArrayList<String> TBA = new ArrayList<String>();
        ArquivoDeRegistro N = new ArquivoDeRegistro();
        String R1 = "32213948;" + DateString + ";entrada";
        TBA.add(R1);
        String R2 = "32213949;" + DateString + ";saida";
        TBA.add(R2);
        String R3 = "32213948;29/03/2023 21:50:00;saida";
        TBA.add(R3); 
        String path = "C:\\Users\\gabri\\OneDrive\\Desktop\\Mackenzie S3\\Prog II\\Collections e Arquivos\\dados.txt";
        N.Escrever(path, TBA);
        N.ler(path);
        for (int i = 0; i < N.REGISTROS.size(); i++){
            System.out.println(N.REGISTROS.get(i).GetTIA());
            System.out.println(N.REGISTROS.get(i).GetdataHora());
            System.out.println(N.REGISTROS.get(i).Gettipo());
        }
        N.TimeSpent("32213948");
        N.Buscar("32213948");
        System.out.println("Lista de registros com o TIA:");
        for(int i = 0; i < N.Found.size(); i++){
            System.out.println(N.Found.get(i).GetTIA());
            System.out.println(N.Found.get(i).GetdataHora());
            System.out.println(N.Found.get(i).Gettipo());
        }

    }
}
