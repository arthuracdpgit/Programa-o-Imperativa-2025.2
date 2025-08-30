import java.util.Scanner;

public class matriz {
    static int n = 4;
    static int[][] matriz = new int[n][n];
    static Scanner input = new Scanner(System.in);

    public static void preencherMatriz() {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void imprimirDiagonalSecundaria() {
        System.out.println("Diagonal secundária:");
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            System.out.println(matriz[i][j]);
        }
    }

    public static void main(String[] args) {
        preencherMatriz();
        imprimirDiagonalSecundaria();
    }
}
