/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw;

/**
 *
 * @author danecek
 */
public class Rectangle {

    private Point refPoint;
    private double width;
    private double height;
    
    public static final Rectangle EMPTY_RECTANGLE = new Rectangle(0, 0, 0, 0);
           

    public Rectangle(Point refPoint, double width, double height) {
        this.refPoint = refPoint;
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("negative!!!");
        this.width = width;
        this.height = height;
    }

    public Rectangle(double x, double y, double width, double height) {
        this(new Point(x, y), width, height);
    }

    @Override
    public String toString() {
        return String.format("Rect[%f, %f, %f, %f]", refPoint.getX(), refPoint.getY(), width, height);
    }

    public Point getRefPoint() {
        return refPoint;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    Rectangle union(Rectangle r2) {
        double x = Math.min(refPoint.getX(), r2.getRefPoint().getX());
        double y = Math.max(refPoint.getY(), r2.getRefPoint().getY());
        return new Rectangle(new Point(x, y), 0, 0);
    }

}
