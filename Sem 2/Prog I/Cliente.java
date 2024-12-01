public class Cliente{
    String cpf;
    String Name;
    int Status;
    double BuyingPower;
public void ConstrutorA(String x, String y, int z){
    this.cpf = x;
    this.Name = y;
    this.Status = z;
}
public void ConstrutorB(String x, String y){
    this.cpf = x;
    this.Name = y;
}
public void SetLimit(){
    if(Status == 2){
        this.BuyingPower = 750;
    }
    else if(Status==1){
        this.BuyingPower = 500;
    }
    else{
        this.BuyingPower = 250;
    }
}
}