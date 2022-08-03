public class SumMin {
    public static void main(String[] args) {
        int A = 2, B = 7, sum = 0;
        for(int i = A + 1; i < B; i++){
            sum += i;
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("summa = " + sum);
    }
}
