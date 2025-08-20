import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;

        System.out.print("Digite o tamanho do quadrado: ");
        tamanho = sc.nextInt();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("*");
            }
                System.out.println(); 
        }

        sc.close();
    }
}
