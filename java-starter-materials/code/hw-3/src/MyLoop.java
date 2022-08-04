public class MyLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//        for (int i = 0; i < 5; i++){
//            for (int j = -1; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        System.out.print("*******************************************");
        int coordY = 4, coordX = 7;

        int temp = 0, tempI = 0, count = 1;
        temp = coordX / 2;
        for (int i = 1; i < coordY + 1; i++){
            tempI = count;
            //System.out.printf("count = %1$s tempI = %2$s \n",count, tempI);
            for (int j = 1; j < coordX + 1; j++){
                if (i == 1 && j <= temp) {
                    System.out.print(" ");
                    continue;
                }
                if (j <= temp){
                    System.out.print(" ");
                }else if (tempI != 0){
                    System.out.print("*");
                    tempI--;
                }else {
                    System.out.print(" ");
                }
            }
            temp--;
            count += 2;
            System.out.print("\n");
        }
//        System.out.printf("count = %1$s tempI = %2$s  temp = %3$s  \n",count, tempI, temp);
        count -= 4;
        tempI -= 2;
        temp = 1;
        for (int i = coordY; i > 1; i--){
            tempI = count;
          //  System.out.printf("count = %1$s tempI = %2$s  temp = %3$s  i = %4$s\n",count, tempI, temp, i);
            for (int j = 0; j < coordX + 1; j++){
//                System.out.printf("count = %1$s tempI = %2$s  temp = %3$s j = %4$s \n",count, tempI, temp, j);
//
                if (j < temp){
                    System.out.print(" ");
                }else if (tempI != 0){
                    System.out.print("*");
                    tempI--;
                }else {
                    System.out.print(" ");
                }
            }
            temp++;
            count -= 2;
            System.out.print("\n");
        }
    }
}
