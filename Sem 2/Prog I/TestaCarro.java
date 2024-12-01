public class TestaCarro {
   public static void main(String[] args){
       CarroCorrida Carrinho = new CarroCorrida(01, "Senna", "McLaren", 250, 0, false);
       Carrinho.GetInfo();
       Carrinho.SetNumber(00);
       Carrinho.SetDriver("Rubinho Barrichello");
       Carrinho.SetTeam("Pirelli");
       Carrinho.SetMaxSpeed(100);
       Carrinho.SetSpeed(0);
       Carrinho.SetEngineOn(false);
       Carrinho.GetInfo();
       Carrinho.Accelerate(50);
       Carrinho.Brake(90);
       Carrinho.Ignition();
       Carrinho.GetInfo();
       Carrinho.Accelerate(50);
       Carrinho.Accelerate(100);
       Carrinho.Brake(50);
       Carrinho.Brake(110);
       Carrinho.Accelerate(97);
       Carrinho.Stop();
       Carrinho.TurnOff();
   } 
}
