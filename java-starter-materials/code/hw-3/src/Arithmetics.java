import java.util.Scanner;
public class Arithmetics {
    static int add(int num1, int num2){
        return num1 + num2;
    }
    static int sub(int num1, int num2){
        return num1 - num2;
    }
    static int mul(int num1, int num2){
        return num1 * num2;
    }
    static String div(int num1, int num2){
        if (num2 == 0){
            return "devide by Zero";
        }
        return Double.toString(num1 / num2) ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = input.nextInt();
        int b = input.nextInt();
        String c = input.next();

        switch (c){
            case "+":
                System.out.println(add(a,b));
                break;
            case "-":
                System.out.println(sub(a,b));
                break;
            case "*":
                System.out.println(mul(a,b));
                break;
            case "/":
                System.out.println(div(a,b));
                break;
            default:
                System.out.println("NOT SIGN");
        }
    }
}
