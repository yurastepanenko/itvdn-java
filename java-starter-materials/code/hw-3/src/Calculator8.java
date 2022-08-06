public class Calculator8 {
    static double [] calculate(int num1, int num2, int num3){
        double [] res = {num1 /5, num2 /5, num3 /5};
        System.out.printf("val1 = %1$s, val2 = %2$s, val3 = %3$s",res[0],res[1],res[2]);
        return res;
    }
    public static void main(String[] args) {
        calculate(10,15,20);
    }
}
