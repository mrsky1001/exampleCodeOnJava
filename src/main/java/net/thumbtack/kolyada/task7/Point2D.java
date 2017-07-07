package net.thumbtack.kolyada.task7;

import java.util.Objects;

import static java.lang.System.out;

public class Point2D {
    private double X;

    private double Y;


    public Point2D(final double x, final double y) {
        this.X = x;
        this.Y = y;
    }

    public Point2D() {
        this.X = 0;
        this.Y = 0;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(final double x) {
        this.X = x;
    }

    public void setY(final double y) {
        this.Y = y;
    }

    public void printCoordinats() {
        out.print("(" + X + ", " + Y + ")");
    }

    public void move(final double dx, final double dy) {
        X += dx;
        Y += dy;
    }

    @Override
    public boolean equals(final Object o) {

        if (o == this) return true;
        if (!(o instanceof Point2D)) {
            return false;
        }
        Point2D point2D = (Point2D) o;
        return X == point2D.X && Y == point2D.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }
}
