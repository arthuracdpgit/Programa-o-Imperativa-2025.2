import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;

        System.out.print("Digite o tamanho do triângulo: ");
        tamanho = sc.nextInt();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = tamanho - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
