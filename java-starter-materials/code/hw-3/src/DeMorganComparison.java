public class DeMorganComparison {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;
        System.out.println(A || B);
        System.out.println(!(!A && !B));
    }
}
