public class TestaCliente {
    public static void main(String[] args){
        Cliente Cliente1 = new Cliente();
        Cliente Cliente2 = new Cliente();
        Cliente1.ConstrutorA("123456789-10", "Joe Biden", 2);
        Cliente1.SetLimit();
        System.out.println("Nome do Cliente: " +Cliente1.Name);
        System.out.println("Limite de compra do cliente em R$: "+Cliente1.BuyingPower);
        Cliente2.ConstrutorB("987654321-10", "Barack Obama");
        Cliente2.SetLimit();
        System.out.println("Nome do Cliente: " +Cliente2.Name);
        System.out.println("Limite de compra do cliente em R$: "+Cliente2.BuyingPower);
    }
}
