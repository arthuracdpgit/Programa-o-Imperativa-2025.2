import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();
         if (volume <= 0) {
            System.out.println("Min volume");
        } else if (volume<= 25) {
            System.out.println("Low volume");
        } else if (volume > 25 && volume <= 75) {
            System.out.println("Medium volume");
        } else if (volume > 75 && volume <= 100) {
            System.out.println("High volume");
        } else {
            System.out.println("Max volume");
        }
        sc.close();
    }
}