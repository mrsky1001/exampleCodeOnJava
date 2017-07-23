package net.thumbtack.kolyada.lesson2.task3;

import net.thumbtack.kolyada.dao.Dao;

import java.util.Arrays;


public class Task3 {
    public static void main(String[] args) {
        int a = 9;
        double b = 9.99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Integer c = new Integer(a);
        Double d = new Double(b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = c;
        double f = d;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
