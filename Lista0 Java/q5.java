import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, periodo;

        System.out.print("Digite o ano da primeira vacinacao: ");
        ano = sc.nextInt();
        System.out.print("Digite o periodo de tempo entre as vacinas: ");
        periodo = sc.nextInt(); 

        for (int i = 0; i < 4; i++) {
            
            int anoDose = ano + (i + 1) * periodo;
            
            System.out.print(anoDose + " ");
        }
        
        sc.close();
    }
}