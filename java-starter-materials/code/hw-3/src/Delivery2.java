import java.util.Scanner;

public class Delivery2 {
    static int myRecursion(int clients){
        if (clients == 0){
            return 1;
        }
        return clients * (myRecursion(clients-1));
    }
    public static void main(String[] args) {
        int N, rez = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        N = sc.nextInt();

        System.out.println(myRecursion(N));
    }
}
