package net.thumbtack.kolyada.task4;

import net.thumbtack.kolyada.dao.Dao;
import net.thumbtack.kolyada.task7.Point2D;

import java.util.Arrays;

import static java.lang.System.out;


public class Task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        try {
            Point2D P1 = new Point2D(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            Point2D P2 = new Point2D(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
            Point2D point = new Point2D(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
            if (((point.getX() >= P1.getX() && point.getY() >= P1.getY()) && (point.getX() <= P2.getX() && point.getY() <= P2.getY())) ||
                    ((point.getX() <= P1.getX() && point.getY() <= P1.getY()) && (point.getX() >= P2.getX() && point.getY() >= P2.getY())) ||
                    ((point.getX() >= P1.getX() && point.getY() <= P1.getY()) && (point.getX() <= P2.getX() && point.getY() >= P2.getY())) ||
                    ((point.getX() <= P1.getX() && point.getY() >= P1.getY()) && (point.getX() >= P2.getX() && point.getY() <= P2.getY())))
                System.out.println("A point belongs to the rectangle.");
            else
                System.out.println("The point does not belong to the rectangle.");
        } catch (NumberFormatException e) {
            out.println(e.getMessage());
        }
    }
}
