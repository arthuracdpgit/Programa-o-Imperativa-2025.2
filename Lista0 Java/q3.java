import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.print("O coeficiente não pode ser zero!");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Nao existem raízes.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.printf("Raiz unica: %.2f%n", raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Raizes: %.2f e %.2f%n", raiz1, raiz2);
            }
        }

    }
}


 