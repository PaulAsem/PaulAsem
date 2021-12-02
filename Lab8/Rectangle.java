public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(String name, String color, double l, double w)
    {
        super(name, color);
        setLength(l);
        setWidth(w);
    }

    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        length = l;
    }

    public double setWidth()
    {
        return width;
    }
    public void setWidth(double w)
    {
        width = w;
    }

    public double area()
    {
        return width * length;
    }
    public String toString()
    {
        return("Area of rectangle: " + area());
    }
}
