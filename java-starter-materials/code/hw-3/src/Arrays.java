public class Arrays {
    public static void main(String[] args) {
        int [] myArray = new int [10];
        for (int i = 0; i < 10; i++){
            myArray[i] = i;
        }
        for (int o : myArray){
            System.out.println(" " + myArray[myArray.length-o-1]);
        }

    }
}
