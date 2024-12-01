public class Main2 {
    public static void main(String[] args){
        Moeda M1 = new Moeda(50, "Juca");
        Cofre C1 = new Cofre();
        Moeda M2 = new Moeda(100, "Zeca");
        C1.adicionar(M1);
        System.out.println(C1.calcularTotal());
        C1.adicionar(M2);
        System.out.println(C1.calcularTotal());
    }
}
