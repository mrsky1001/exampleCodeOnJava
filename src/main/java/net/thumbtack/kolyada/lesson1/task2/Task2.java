package net.thumbtack.kolyada.lesson1.task2;

import net.thumbtack.kolyada.dao.Dao;

import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int[] argsNew = Dao.parseIntArray(args);

        System.out.println("a + b = " + (argsNew[0] + argsNew[1]));
        System.out.println("a - b = " + (argsNew[0] - argsNew[1]));
        System.out.println("a * b = " + (argsNew[0] * argsNew[1]));
        try {
            System.out.println("a % b = " + (argsNew[0] % argsNew[1]));
            System.out.println("a / b = " + (argsNew[0] / argsNew[1]));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        if (argsNew[0] > argsNew[1])
            System.out.println("a > b");
        else if (argsNew[0] > argsNew[1])
            System.out.println("a < b");
        else if (argsNew[0] > argsNew[1])
            System.out.println("a == b");

    }
}
