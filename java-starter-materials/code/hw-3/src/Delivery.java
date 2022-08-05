import java.util.Scanner;
public class Delivery {
    public static void main(String[] args) {
        int N, rez = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        N = sc.nextInt();
        do {
            rez *= N;
            N--;
        }while(N > 1);
        System.out.println(rez);
    }
}
