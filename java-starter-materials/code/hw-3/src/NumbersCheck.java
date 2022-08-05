public class NumbersCheck {
    static String numInfo(int num){
        boolean sign = num < 0;
        return "Num < 0  = " + sign;
    }
    public static void main(String[] args) {
        System.out.println(numInfo(7));

    }
}
