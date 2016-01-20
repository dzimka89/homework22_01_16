package bug_4;

import java.awt.*;

class A {

    private int[] xArray;
    private int[] yArray;

    public A(int[] x, int[] y) {
        this.xArray = x;
        this.yArray = y;
    }

    Polygon polygon = new Polygon(xArray, yArray, yArray.length);

    private int width = polygon.getBounds().width;
    private int height = polygon.getBounds().height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}