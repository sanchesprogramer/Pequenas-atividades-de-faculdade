import java.util.*;
public class Registro{
    public String TIA;
    public String dataHora;
    public boolean tipo;
public Registro(String x, String y, boolean z){
    this.TIA = x;
    this.dataHora = y;
    this.tipo = z;
}
public String GetTIA(){
    return this.TIA;
}
public String GetdataHora(){
    return this.dataHora;
}
public String Gettipo(){
    if(this.tipo == true){
        return "entrada";
    }
    else{
        return "saida";
    }
}
public void SetTIA(String x){
    this.TIA = x;
}
public void SetdataHora(String x){
    this.dataHora = x;
}
public void SetTipo(boolean x){
    this.tipo = x;
}
}