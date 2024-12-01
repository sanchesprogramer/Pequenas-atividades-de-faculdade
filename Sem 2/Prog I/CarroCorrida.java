public class CarroCorrida{
    private int Carnum;
    private String Driver;
    private String Team;
    private float MaxSpeed;
    private float Speed;
    private Boolean EngineOn;

    public CarroCorrida(int x, String y, String z, float a, float b, Boolean c){
        this.Carnum = x;
        this.Driver = y;
        this.Team = z;
        this.MaxSpeed = a;
        this.Speed = b;
        this.EngineOn = c;
    }
    public void Ignition(){
    this.EngineOn = true;
}
public void TurnOff(){
    this.EngineOn = false;
}
//Getter
public void GetInfo(){
    System.out.println("Car Number: " +this.Carnum);
    System.out.println("Driver: " +this.Driver);
    System.out.println("Team: "+this.Team);
    System.out.println("Max Speed: "+this.MaxSpeed);
    System.out.println("Current Speed: "+this.Speed);
    System.out.println("Car on: "+this.EngineOn);
}
//setters
public void SetNumber(int x){
    this.Carnum = x;
}
public void SetDriver(String x){
    this.Driver = x;
}
public void SetTeam(String x){
    this.Team = x;
}
public void SetMaxSpeed(float x){
    this.MaxSpeed = x;
}
public void SetSpeed(float x){
    this.Speed = x;
}
public void SetEngineOn(Boolean x){
    this.EngineOn = x;
}
public void Accelerate(float x){
    if (this.EngineOn == false){
        System.out.println("Please turn on the car!");
        return;
    }
    if (x + this.Speed <= this.MaxSpeed){
        this.Speed = this.Speed + x;
        System.out.println("Current speed in km/h: "+this.Speed);
        return;
    }
    else{
        System.out.println("Do not exceed the speed limit!");
        return;
    }
}     
public void Brake(float x){
    if (this.EngineOn == false){
        System.out.println("Please turn on the car!");
        return;
    }
    float Braker = x/100;
    this.Speed = this.Speed*(1-Braker);
    if(this.Speed < 0){
        this.Speed = 0;
        System.out.println("Current Speed: " +this.Speed);
        return;
    }
    else{
        System.out.println("Current Speed: "+this.Speed);
        return;
    }
}
public void Stop(){
    this.Speed = 0;
    System.out.println("Car Stopped.");
}
}

