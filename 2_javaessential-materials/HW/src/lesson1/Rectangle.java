package lesson1;

import java.util.Scanner;

public class Rectangle {
     double side1, side2;
     double areaCalculator (){
        return side1 * side2;
    }
    double perimeterCalculator (){
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("Enter side1");
        rec.side1 = sc.nextDouble();
        System.out.println("Enter side2");
        rec.side2 = sc.nextDouble();
        System.out.println(rec.areaCalculator());
        System.out.println(rec.perimeterCalculator());

    }
}
