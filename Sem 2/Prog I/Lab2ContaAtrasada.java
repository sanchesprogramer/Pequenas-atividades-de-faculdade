class Lab2ContaAtrasada{
    public static void main(String[] args){
        double salario = 2000;
        double conta1 = 100;
        double conta2 = 50;
        double totalpagar;
        double restante;
        conta1 = conta1*1.02;
        conta2 = conta2*1.02;
        totalpagar = conta1+conta2;
        restante = salario-totalpagar;
        System.out.println("O total restante do salário de João é de: " + restante);

    }
}