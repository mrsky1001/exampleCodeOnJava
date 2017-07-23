package net.thumbtack.kolyada.lesson2.task14;


import net.thumbtack.kolyada.task10.Circle;
import net.thumbtack.kolyada.task7.Point2D;

class CircleFactory {

    private int countCircles;

    int getCountCircles() {
        return countCircles;
    }

    Circle createCircle(final Point2D center, final int radius) {
        this.countCircles++;
        return new Circle(center, radius);
    }


}
