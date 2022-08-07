public class ReversedArray {
    static int [] myReverse(int [] array) {
        int [] res = new int[array.length];
        for (int i = 0; i < array.length;i++ ){
            res[i] = array[array.length - 1 - i];
        }
        for(int o: res){
            System.out.println(o);
        }
        return res;
    }

    static int [] subArray(int [] array, int index, int count){
        int [] res = new int[count];

        for (int i = 0; i <= res.length - 1;i++ ){

               if(i < array.length-1){
//                  System.out.println( i);
                   res[i] = array[index];
                   index++;

               }else {
                   res[i] = 1;
               }
        }
        for(int o: res){
            System.out.println(o);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] userArray = {7,8,9,6};
//        myReverse(userArray);
        subArray(userArray,1,6);
    }
}
