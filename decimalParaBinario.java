public class decimalParaBinario {

    public static String decimalParaBinario(int n) {
        
        if (n == 0) {
            return "0";
        }
        
       
        if (n > 0) {
           
            return decimalParaBinario(n / 2) + (n % 2);
        }
        
        return "Número não suportado para conversão.";
    }

    public static void main(String[] args) {
        int numeroDecimal = 56;
        String binario = decimalParaBinario(numeroDecimal);
        System.out.println("O número " + numeroDecimal + " em binário é: " + binario);
        
        int outroNumero = 23;
        String binario2 = decimalParaBinario(outroNumero);
        System.out.println("O número " + outroNumero + " em binário é: " + binario2);
    }
}
