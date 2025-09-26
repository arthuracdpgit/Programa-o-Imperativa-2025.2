public class VerificadorPrimo {
    public static boolean ehPrimo(int n, int divisor) {
      
        if (n <= 1) {
            return false;
        }
        
        if (n == divisor) {
            return true;
        }
        
        if (n % divisor == 0) {
            return false;
        }
        
        return ehPrimo(n, divisor + 1);
    }
    
    public static boolean isPrimo(int n) {
        return ehPrimo(n, 2);
    }

    public static void main(String[] args) {
        int numero1 = 13;
        int numero2 = 22;
        
        //Número primo
        if (isPrimo(numero1)) {
            System.out.println(numero1 + " é um número primo.");
        } else {
            System.out.println(numero1 + " não é um número primo.");
        }
        
        //Número não primo
        if (isPrimo(numero2)) {
            System.out.println(numero2 + " é um número primo.");
        } else {
            System.out.println(numero2 + " não é um número primo.");
        }
    }
}