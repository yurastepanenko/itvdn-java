import java.util.Scanner;
public class CustomerArray {
    public static void main(String[] args) {
        int N;
        int maxValue = 0, minValue = 0, sumValue = 0;
        double avgValue =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        N = sc.nextInt();

        int [] myArray = new int [N];
        for (int i = 0; i < N; i++){
            myArray[i] = (int)(Math.random()*100 );
        }
        maxValue = myArray[0];
        minValue = myArray[0];
        sumValue = myArray[0];
        for (int i = 1; i < N; i++){

            if (myArray[i] > maxValue){
                maxValue = myArray[i];
            }
            if (myArray[i] < minValue){
                minValue = myArray[i];
            }
            if (myArray[i] != 0){
                sumValue += myArray[i];
            }
        }
        avgValue = sumValue / myArray.length;
        System.out.printf("maxValue = %1$s, minValue = %2$s, sumValue = %3$s, avgValue = %4$s \n",maxValue, minValue,
                sumValue, avgValue);
        for (int o:myArray){
            System.out.print(" " + o);
        }
        for (int i = 0; i < N; i++){
            if(i % 2 == 0 ){
                System.out.printf ("\nmyArray[i] = %1$s, value = %2$s",i, myArray[i]);
            }
        }

    }
}
