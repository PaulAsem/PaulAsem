public class Sphere extends ThreeDShape
{
   private int radius;
   
   public Sphere(String name, String color, int r)
   {
       super(name,color);
       setRadius(r);    
   }
   public int getRadius()
   {
       return radius;
   }
   public void setRadius(int r)
   {
       radius = r;
   }
   public double area()
   {
       return 4*Math.PI*(radius*radius);
       
   }
   public double volume()
    {
        return (4.0/3.0*Math.PI*(radius*radius*radius));
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
