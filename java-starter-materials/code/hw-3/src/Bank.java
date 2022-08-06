public class Bank {
    static int duty = 700;
    public static String checkDuty(int sum){
        String res;
        duty = duty - sum;
        if (duty > 0){
            System.out.printf("duty = %1$s (((( \n", duty);
            res = Integer.toString(duty);
        } else if (duty == 0) {
            System.out.printf("duty = %1$s )\n", duty);
            res = Integer.toString(duty);
        }else {
            System.out.printf("duty = %1$s )))))\n", duty);
            res = Integer.toString(duty);
        }

        return res;
    }
    public static void main(String[] args) {
        int monthlyPaymentAmount = 100;

        checkDuty(100);
        checkDuty(600);
        checkDuty(200);

    }
}
