import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        double userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        userNumber = sc.nextDouble();
        if (userNumber >= 0 && userNumber < 15){
            System.out.println("in [0 - 14]");
        } else if (userNumber >= 15 && userNumber < 36) {
            System.out.println("in [15 - 35]");
        }else if ((userNumber >= 36 && userNumber <= 100)){
            System.out.println("in [36 - 100]");
        }else {
            System.out.println("not in [0 - 100]");
        }
    }
}
