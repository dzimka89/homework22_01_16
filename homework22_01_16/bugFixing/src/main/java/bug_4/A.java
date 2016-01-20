package bug_4;

import java.awt.*;

class A {


    public int[] xArray = new int[5];
    public int[] yArray = new int[5];
    int width;
    int height;


//    public A(int[] x, int[] y) {
//        this.xArray = x;
//        this.yArray = y;
//    }

    public void setWidthHeight(int x[], int y[], int i) {
        Polygon polygon = new Polygon(x, y, i);

        int width = polygon.getBounds().width;
        int height = polygon.getBounds().height;
        this.width = width;
        this.height = height;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}