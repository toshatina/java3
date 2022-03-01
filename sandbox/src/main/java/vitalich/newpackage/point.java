package vitalich.newpackage;

import static java.lang.Math.sqrt;

public class point {
    public double x;
    public double y;
    public point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public  double Distance (point  point2)
    {
        return sqrt((((this.x) - (point2.x)) * ((this.x) - (point2.x))) + (((this.y) - (point2.y)) * ((this.y) - (point2.y))));

    }
}
