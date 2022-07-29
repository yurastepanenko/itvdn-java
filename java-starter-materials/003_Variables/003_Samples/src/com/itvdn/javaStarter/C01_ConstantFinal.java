package com.itvdn.javaStarter;

public class C01_ConstantFinal {
    public static void main(String[] args) {
        // На 7-й строке, создаем константу с именем PI, типа double и присваиваем ей значение 3.141

        final double PI = 3.1415;

        // На 11-й строке, выводим значение константы - PI, на экран.

        System.out.println("Значение числа Пи в мирное время равно: " + PI + " в лучшие годы");

        // Попытка присвоения константе нового значения, приводит к ошибке уровня компиляции!

        // PI = 2.71828183;
    }
}

