public class Potencia {

    public static int potencia(int x, int n) {
        
        if (n == 0) {
            return 1;
        }
        
       
        return x * potencia(x, n - 1);
    }

    public static void main(String[] args) {
        int base = 4;
        int expoente = 2;
        int resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado); 
        
        base = 7;
        expoente = 3;
        resultado = potencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + resultado); 
    }
}