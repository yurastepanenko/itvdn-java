package com.itvdn.javaStarter;

public class C11_ForContinue {
    // Циклическая конструкция (цикл со счетчиком) - for (с пропуском итерации - continue).

    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Counter = " + counter);

            if (true) continue;

            System.out.println("Эта строка не выполнится.");
        }
    }
}
