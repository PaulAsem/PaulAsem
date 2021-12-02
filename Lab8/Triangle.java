public class Triangle extends TwoDShape
{
    private double height;
    private double base;
    private String color;

    public Triangle(String name, String c, int i, int j)
    {
        super(name, c);
        setHeight(i);
        setBase(j);
        setColor(c);
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double h)
    {
        height = h;
    }
    public double getBase()
    {
        return base;
    }
    public void setBase(double b)
    {
        base = b;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String c)
    {
        color = c;
    }

    public double area()
    {
        return 0.5*base*height;
    }

}
