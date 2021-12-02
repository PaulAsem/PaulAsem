public class Cylinder extends ThreeDShape
{
    private int radius;
    private int height;

    public Cylinder(String name, String color, int r, int h)
    {
        super(name, color);
        setRadius(r);
        setHeight(h);
    }
    public int getRadius()
    {
        return radius;
    }
    public void setRadius(int r)
    {
        radius = r;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int h)
    {
        height = h;
    }
    public double area()
    {
        return ((2*22*radius)/7*(radius*height));
    }
    public double volume()
    {
        return Math.PI*(radius*radius)*height;
    }
    public String toString()
    {
        return("Area: " + area());     
    }
    public String Vol()
    {
        return("Volume: " + volume());
    }
}
