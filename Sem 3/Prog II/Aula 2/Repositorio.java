import java.util.ArrayList;
public class Repositorio{
    public static ArrayList<Paciente> Data = new ArrayList<Paciente>();
public static void Cadastrar(Paciente P){
    Data.add(P);
}
public static void Buscar(String CPF){
    for(int i = 0; i < Data.size(); i++){
        if(CPF == Data.get(i).getCPF()){
            Data.get(i).Printer();
        }
    }
}
public static void Delete(String CPF){
     for(int i = 0; i < Data.size(); i++){
        if(CPF == Data.get(i).getCPF()){
            Data.remove(i);
        }
    }
}
public static void Printer(){
    Boolean Found = false;
    for(int i = 0; i < Data.size(); i++){
        Data.get(i).Printer();
        Found = true;
    }
    if (Found = false){
        System.out.println("CPF não encontrado.");
    }
}
}