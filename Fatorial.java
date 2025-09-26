public class Fatorial {

    public static long fatorial(int n) {
       
        if (n == 0) {
            return 1;
        }
        
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 10;
        long resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}