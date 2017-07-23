package net.thumbtack.kolyada.lesson1.task9;

import net.thumbtack.kolyada.lesson1.task7.Point2D;
import net.thumbtack.kolyada.lesson1.task8.Rectangle;

import java.util.Objects;

import static java.lang.System.out;

public class Triangle {

    private Point2D coord1;

    private Point2D coord2;

    private Point2D coord3;

    public Triangle(final Point2D coord1, final Point2D coord2, final Point2D coord3) {
        this.coord1 = coord1;
        this.coord2 = coord2;
        this.coord3 = coord3;
    }

    public Point2D getCoord1() {
        return coord1;
    }

    public void setCoord1(Point2D coord1) {
        this.coord1 = coord1;
    }

    public Point2D getCoord2() {
        return coord2;
    }

    public void setCoord2(Point2D coord2) {
        this.coord2 = coord2;
    }

    public Point2D getCoord3() {
        return coord3;
    }

    public void setCoord3(Point2D coord3) {
        this.coord3 = coord3;
    }

    public void printCoordinats() {
        out.println("coord1: ");
        coord1.printCoordinats();
        out.println("coord2: ");
        coord2.printCoordinats();
        out.println("coord3: ");
        coord3.printCoordinats();
    }

    public void move(final double dx, final double dy) {
        coord1.move(dx, dy);
        coord2.move(dx, dy);
        coord3.move(dx, dy);
    }


    private double space() {
        return Math.abs(((coord1.getX() - coord3.getX()) * (coord2.getY() - coord3.getY()) - (coord2.getX() - coord3.getX()) * (coord1.getY() - coord3.getY())) / 2);
    }

    public boolean pointBelong(final double x, final double y) {
        final double s1 = Math.abs((coord2.getX() - coord1.getX()) * (y - coord1.getY()) - (x - coord1.getX()) * (coord2.getY() - coord1.getY())) / 2;
        final double s2 = Math.abs((x - coord1.getX()) * (coord3.getY() - coord1.getY()) - (coord3.getX() - coord1.getX()) * (y - coord1.getY())) / 2;
        final double s3 = Math.abs((coord2.getX() - x) * (coord3.getY() - y) - (coord3.getX() - x) * (coord2.getY() - y)) / 2;

        return (this.space() == s1 + s2 + s3);
    }

    public boolean pointBelong(final Point2D point) {
        final double s1 = Math.abs((coord2.getX() - coord1.getX()) * (point.getY() - coord1.getY()) - (point.getX() - coord1.getX()) * (coord2.getY() - coord1.getY())) / 2;
        final double s2 = Math.abs((point.getX() - coord1.getX()) * (coord3.getY() - coord1.getY()) - (coord3.getX() - coord1.getX()) * (point.getY() - coord1.getY())) / 2;
        final double s3 = Math.abs((coord2.getX() - point.getX()) * (coord3.getY() - point.getY()) - (coord3.getX() - point.getX()) * (coord2.getY() - point.getY())) / 2;

        return (this.space() == s1 + s2 + s3);
    }

    public boolean equilateral() {
        final double a = Math.sqrt(Math.pow((coord3.getX() - coord2.getX()), 2) + Math.pow((coord3.getY() - coord2.getY()), 2));
        final double b = Math.sqrt(Math.pow((coord2.getX() - coord1.getX()), 2) + Math.pow((coord2.getY() - coord1.getY()), 2));
        final double c = Math.sqrt(Math.pow((coord3.getX() - coord1.getX()), 2) + Math.pow((coord3.getY() - coord1.getY()), 2));

        return a == b && a == c;
    }

    @Override
    public boolean equals(final Object o) {

        if (o == this) return true;
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return coord1 == triangle.coord1 && coord2 == triangle.coord2 && coord3 == triangle.coord3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coord1, coord2, coord3);
    }
}
