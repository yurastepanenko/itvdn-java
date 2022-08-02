import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        double V, S;
        final float PI = 3.1415f;
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite h: ");
        int h = input.nextInt();
        System.out.println("Vvedite R: ");
        int R = input.nextInt();
        V = PI * Math.pow(R, 2) * h;
        S = 2 * PI * R *( R + h);
        System.out.printf("V = %1$s, S = %2$s ", V, S);
    }
}
