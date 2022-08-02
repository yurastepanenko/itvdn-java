import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        final float PI = 3.1415f;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int r = input.nextInt();
        float S = PI * (float)Math.pow(r, 2);
        System.out.printf("Площадь круга равна = %1$f",S);
    }
}
