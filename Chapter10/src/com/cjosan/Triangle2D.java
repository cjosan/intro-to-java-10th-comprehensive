package com.cjosan;

/**
 * Created by admin on 19.06.2017.
 */
public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double p = (p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) / 2;
        return Math.sqrt(p * (p - p1.distance(p2)) * (p - p2.distance(p3)) * (p3.distance(p1)));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint p) {
        double alpha = ((p2.getY() - p3.getY())*(p.getX() - p3.getX()) + (p3.getX() - p2.getX())*(p.getY() - p3.getY())) /
                ((p2.getY() - p3.getY())*(p1.getX() - p3.getX()) + (p3.getX() - p2.getX())*(p1.getY() - p3.getY()));
        double beta = ((p3.getY() - p1.getY())*(p.getX()- p3.getX()) + (p1.getX() - p3.getX())*(p.getY() - p3.getY())) /
                ((p2.getX() - p3.getX())*(p1.getX() - p3.getX()) + (p3.getX() - p2.getX())*(p1.getY() - p3.getY()));
        double gamma = 1.0 - alpha - beta;

        return  alpha > 0 && beta > 0 && gamma > 0;
    }

    public boolean contains(Triangle2D t) {
        return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
    }

    public boolean overlaps(Triangle2D t) {
        if (intersects(this.p1, this.p2, t.getP1(), t.getP2()))
            return true;
        if (intersects(this.p1, this.p2, t.getP2(), t.getP3()))
            return true;
        if (intersects(this.p1, this.p2, t.getP3(), t.getP1()))
            return true;
        if (intersects(this.p2, this.p3, t.getP1(), t.getP2()))
            return true;
        if (intersects(this.p2, this.p3, t.getP2(), t.getP3()))
            return true;
        if (intersects(this.p2, this.p3, t.getP3(), t.getP1()))
            return true;
        if (intersects(this.p3, this.p1, t.getP1(), t.getP2()))
            return true;
        if (intersects(this.p3, this.p1, t.getP2(), t.getP3()))
            return true;
        if (intersects(this.p3, this.p1, t.getP3(), t.getP1()))
            return true;

        return false;
    }

    private boolean intersects(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
        double a = p1.getY() - p2.getY();
        double b = p1.getX() - p2.getX();
        double c = p3.getY() - p4.getY();
        double d = p3.getX() - p4.getX();

        return (a * d - b * c != 0);
    }
}
