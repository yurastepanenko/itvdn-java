import java.util.Scanner;
public class ArithmeticAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = input.nextInt();       //считываем целое число
        int b = input.nextInt();       //считываем целое число
        int c = input.nextInt();       //считываем целое число
        float res = (a + b + c) / 3f;
        System.out.println(res);
    }
}
