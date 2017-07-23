package net.thumbtack.kolyada.lesson2.task2;

import net.thumbtack.kolyada.dao.Dao;

import java.util.Arrays;

//StringBuilder напоминает расширяемую строку, которую можно изменять без ущерба для производительности.

public class Task2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello");
        stringBuilder.insert(stringBuilder.length(), " world!!!");
        System.out.println(stringBuilder.toString());

    }
}
