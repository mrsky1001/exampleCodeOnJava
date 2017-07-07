package net.thumbtack.kolyada.task8;

import net.thumbtack.kolyada.task7.Point2D;

import java.util.Objects;

import static java.lang.System.out;

public class Rectangle {

    private Point2D angLeft;

    private Point2D angRight;


    private Rectangle(final Point2D angLeft, final Point2D angRight) {
        this.angLeft = angLeft;
        this.angRight = angRight;
    }

    public Rectangle(final double length, final double width) {
        this.angLeft = new Point2D(0, 0);
        this.angRight = new Point2D(length, width);
    }

    public Rectangle() {
        this.angLeft = new Point2D(0, 0);
        this.angRight = new Point2D(1, 1);
    }

    public Point2D getAngLeft() {
        return angLeft;
    }

    public void setAngLeft(Point2D angLeft) {
        this.angLeft = angLeft;
    }

    public Point2D getAngRight() {
        return angRight;
    }

    public void setAngRight(Point2D angRight) {
        this.angRight = angRight;
    }

    public void printCoordinats() {
        out.println("angLeft: ");
        angLeft.printCoordinats();
        out.println("angRight: ");
        angRight.printCoordinats();
    }

    public void move(final double dx, final double dy) {
        angLeft.move(dx, dy);
        angRight.move(dx, dy);
    }

    public void reduce(final double nx, final double ny) {
        angRight.setX(angRight.getX() / nx);
        angRight.setY(angRight.getY() / ny);
    }

    public double space() {
        return Math.abs((angRight.getX() - angLeft.getX()) * (angRight.getY() - angLeft.getY()));
    }

    public boolean pointBelong(final double x, final double y) {
        Point2D point = new Point2D(x, y);
        return (((point.getX() >= angLeft.getX() && point.getY() >= angLeft.getY()) && (point.getX() <= angRight.getX() && point.getY() <= angRight.getY())) ||
                ((point.getX() <= angLeft.getX() && point.getY() <= angLeft.getY()) && (point.getX() >= angRight.getX() && point.getY() >= angRight.getY())) ||
                ((point.getX() >= angLeft.getX() && point.getY() <= angLeft.getY()) && (point.getX() <= angRight.getX() && point.getY() >= angRight.getY())) ||
                ((point.getX() <= angLeft.getX() && point.getY() >= angLeft.getY()) && (point.getX() >= angRight.getX() && point.getY() <= angRight.getY())));
    }

    public boolean pointBelong(final Point2D point) {
        return (((point.getX() >= angLeft.getX() && point.getY() >= angLeft.getY()) && (point.getX() <= angRight.getX() && point.getY() <= angRight.getY())) ||
                ((point.getX() <= angLeft.getX() && point.getY() <= angLeft.getY()) && (point.getX() >= angRight.getX() && point.getY() >= angRight.getY())) ||
                ((point.getX() >= angLeft.getX() && point.getY() <= angLeft.getY()) && (point.getX() <= angRight.getX() && point.getY() >= angRight.getY())) ||
                ((point.getX() <= angLeft.getX() && point.getY() >= angLeft.getY()) && (point.getX() >= angRight.getX() && point.getY() <= angRight.getY())));
    }

    public boolean intersects(final Rectangle rectangle) {
        return (angLeft.getY() < rectangle.angRight.getY() || angRight.getY() > rectangle.angLeft.getY() || angRight.getX() < rectangle.angLeft.getX() || angLeft.getX() > rectangle.angRight.getX());
    }

    public boolean invested(final Rectangle rectangle) {
        return (angLeft.getX() > rectangle.angRight.getX() && angLeft.getY() > rectangle.angLeft.getY()) && (angRight.getX() < rectangle.angRight.getX() && angRight.getY() < rectangle.angRight.getY());
    }

    public Rectangle large(final double n) {
        return new Rectangle(new Point2D(angLeft.getX(), angLeft.getY()), new Point2D(angRight.getX() * n, angRight.getY() * n));
    }

    @Override
    public boolean equals(final Object o) {

        if (o == this) return true;
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return angLeft == rectangle.angLeft && angRight == rectangle.angRight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(angLeft, angRight);
    }
}
