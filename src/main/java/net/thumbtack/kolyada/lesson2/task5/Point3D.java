package net.thumbtack.kolyada.lesson2.task5;


import net.thumbtack.kolyada.dao.Dao;

import java.util.Arrays;

public class Point3D extends P {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int[] argsNew = Dao.parseIntArray(args);
        long summ = 0;
        long mul = 1;
        int indexMax = 0;
        int indexMin = 0;

        try {
            for (int i = 0; i < argsNew.length; i++) {
                summ += argsNew[i];
                mul *= argsNew[i];
                if (argsNew[i] > argsNew[indexMax])
                    indexMax = i;
                if (argsNew[i] < argsNew[indexMin])
                    indexMin = i;
            }

            System.out.println("summ = " + summ);
            System.out.println("mul = " + mul);
            System.out.println("average = " + (double) (summ / argsNew.length));
            System.out.println("min = " + argsNew[indexMin]);
            System.out.println("max = " + argsNew[indexMax]);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
        }
    }
}
