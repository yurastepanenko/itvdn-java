import java.util.Scanner;

public class Conversion {
    static void conv(int a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sum: ");
        int a = input.nextInt();
        System.out.println("Enter your kurs: ");
        double b = input.nextDouble();
        conv(a,b);
    }
}
