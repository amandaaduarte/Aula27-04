public class Exemplo1 {
    public static void main(String args[]){
        int dividendo = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        Exemplo1(dividendo, divisor);
    }

    public static void Exemplo1(int dividendo, int divisor){
        System.out.println("Divisão = " + (dividendo/divisor));
    }

}
