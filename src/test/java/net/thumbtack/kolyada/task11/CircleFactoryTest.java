package net.thumbtack.kolyada.task11;

import net.thumbtack.kolyada.task7.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleFactoryTest {
    @Test
    public void getCountCircles() throws Exception {
    }

    @Test
    public void createCircle() throws Exception {
        CircleFactory circleFactory = new CircleFactory();
        circleFactory.createCircle(new Point2D(1, 1), 5);
        circleFactory.createCircle(new Point2D(1, 1), 5);
        circleFactory.createCircle(new Point2D(1, 1), 5);
        System.out.println(circleFactory.getCountCircles());
    }

}