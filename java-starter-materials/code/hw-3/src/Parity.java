public class Parity {
    public static void main(String[] args) {
        int myNumber = 13;
        byte operand = (byte)(myNumber << 1);
        System.out.println((byte)myNumber);
        System.out.println(Integer.toBinaryString(myNumber));
        System.out.println(operand);
        if (myNumber % 2 == 0){
            System.out.println("Chetnoe");
        }else {
            System.out.println("NEchetnoe");
        }

    }
}
