import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double operand1, operand2, result = 0;
        String sign;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first operand");
        operand1 = sc.nextDouble();
        System.out.println("enter the second operand");
        operand2 = sc.nextDouble();
        System.out.println("enter the sign( + - / * )");
        sign = sc.next();

        switch (sign){
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("Devide by Zero");
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("You entered a non-existent operator");
        }
        System.out.printf("Result = %1$s", result);
    }
}
