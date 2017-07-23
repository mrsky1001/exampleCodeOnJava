package net.thumbtack.kolyada.lesson1.task3;

import net.thumbtack.kolyada.dao.Dao;

import java.util.Arrays;


public class Task3
{
    public static void main( String[] args ){
        System.out.println(Arrays.toString(args));

        double[] argsNew = Dao.parseDoubleArray(args);

        System.out.println("a + b = " + (argsNew[0] + argsNew[1]));
        System.out.println("a * b = " + (argsNew[0] * argsNew[1]));
        if (argsNew[0] > argsNew[1])
            System.out.println("a > b");
        else if (argsNew[0] > argsNew[1])
            System.out.println("a < b");
        else if (argsNew[0] > argsNew[1])
            System.out.println("a == b");
    }
}
