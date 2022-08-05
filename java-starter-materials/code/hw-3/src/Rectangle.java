public class Rectangle {
    public static void main(String[] args) {
        int height = 8, width = 10;
        for (int i = 1; i <= height; i++ ){
            for (int j = 1; j <= width; j++ ){
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }
}
