package lesson1;

public class Computer {
    String detail;
    public static void main(String[] args) {
        Computer [] computer = new Computer[5];
        for(int i = 0; i < 5; i++){
            computer[i] = new Computer();
            computer[i].detail = "detail_" + i;
        }
        for (Computer comp : computer) {
            System.out.println("detail: " + comp.detail);
        }

    }
}
