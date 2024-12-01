import java.io.*;
import java.nio.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class ArquivoDeRegistro {
    ArrayList<Registro> REGISTROS = new ArrayList<Registro>();
    ArrayList<Registro> Found = new ArrayList<Registro>();
    public ArrayList ler(String x){
        File file = new File(x);{
        try {
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        String line;
        while((line = b.readLine()) != null){
            //split entered information & process
            String[] info = line.split(";");
            String y = info[1];
            String z = info[0];
            //Object creation based on type
            if(info[2].equals("entrada")){
                boolean a = true;
                Registro R = new Registro(z, y, a);
                REGISTROS.add(R);
            }
            else{
                boolean a = false;
                Registro R = new Registro(z, y, a);
                REGISTROS.add(R);
            }
 

        }
        b.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
            return REGISTROS;
        }   
    
}
public void Escrever(String x, ArrayList y){
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(x));
        for (int i = 0; i < y.size(); i++){
            writer.write(y.get(i).toString());
            writer.newLine();
        }
        while(!y.isEmpty()){
            //clear queue
            y.remove(0);
        }
        writer.close();
    } catch (IOException e) {
       System.out.println("Error writing to the file!");
    }
}
public ArrayList Buscar(String x){
    //clear previous searches
    while(!Found.isEmpty()){
        Found.remove(0);
    }
    //get results
    for (int i = 0; i < REGISTROS.size(); i++){
        if(x.equals(REGISTROS.get(i).GetTIA())){
            Found.add(REGISTROS.get(i));
        }
    }
    return Found;
}
public void TimeSpent(String x){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    while(!Found.isEmpty()){
        Found.remove(0);
    }
     for (int i = 0; i < REGISTROS.size(); i++){
        if(x.equals(REGISTROS.get(i).GetTIA())){
            Found.add(REGISTROS.get(i));    
        }
    }
    try{
        Date d1 = sdf.parse(Found.get(0).GetdataHora());
        Date d2 = sdf.parse(Found.get(1).GetdataHora());
        long TimeSpent = d2.getTime() - d1.getTime();
        long SecDiff = (TimeSpent / 1000) % 60;
        long MinDiff = (TimeSpent / (1000 * 60)) % 60;
        long HourDiff = (TimeSpent / (1000 * 60 * 60)) % 24;
        System.out.println("O aluno com TIA " + x + " passou " + HourDiff + " horas, " + MinDiff
        + " minutos e " + SecDiff + " segundos no Mackenzie");
    }
    catch (ParseException e) {
            e.printStackTrace();
    }
    
}
}

