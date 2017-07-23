package net.thumbtack.kolyada.lesson1.task6;


import net.thumbtack.kolyada.dao.Dao;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int[] argsNew = Dao.parseIntArray(args);
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < argsNew.length - 1; i++) {
            if (argsNew[i] < argsNew[i + 1] && ascending)
                descending = false;
            else if (argsNew[i] > argsNew[i + 1] && descending)
                ascending = false;
            else{
                ascending = false;
                descending = false;
                break;
            }
        }

        if (ascending)
            System.out.println("An array sorted in ascending order.");
        else if (descending)
            System.out.println("An array sorted in descending order.");
        else
            System.out.println("The array is not sorted.");
    }
}
