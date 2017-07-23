package net.thumbtack.kolyada.lesson1.task10;


import net.thumbtack.kolyada.lesson1.task7.Point2D;

import java.util.Objects;

import static java.lang.System.out;

public class Circle
{
    private Point2D center;

    private double radius;

    public Circle(final Point2D center, final double radius) {
        this.center = center;
        try {
            if(radius > 0)
                this.radius = radius;
            else
                throw new Throwable("The radius must be positive!");
        }
        catch (Throwable t){
            out.println(t.getMessage());
        }
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printCoordinats() {
        out.println("center: ");
        center.printCoordinats();
        out.println("radius: " + radius);
    }

    public void move(final double dx, final double dy) {
        center.move(dx, dy);
    }

    public double space() {
        return Math.abs(Math.PI * Math.pow(radius, 2));
    }

    public double length() {
        return Math.abs(2 * Math.PI * radius);
    }
    public boolean pointBelong(final double x, final double y) {
      return Math.abs(center.getX() - x) < radius && Math.abs(center.getY() - y) < radius;
    }

    public boolean pointBelong(final Point2D point) {
        return Math.abs(center.getX() - point.getX()) < radius && Math.abs(center.getY() - point.getY()) < radius;
    }

    @Override
    public boolean equals(final Object o) {

        if (o == this) return true;
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle circle = (Circle) o;
        return center == circle.center && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius );
    }
}
