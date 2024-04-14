package geometrie;

import java.lang.Math;

public class Kreis extends Figur2D
{
    private static final int DEFAULT_RADIUS = 5;
    
    private int radius;
    
    public int getRadius()
    {
        return this.radius;
    }
    
    public void setRadius(int x)
    {
        if (x < 1)
        {
            return;
        }

        this.radius = x;
    }
    
    public Kreis(Punkt bezug, int radius)
    {
        super(bezug);
        
        if (radius < 1)
        {
            this.radius = 1;
            return;
        }
        
        this.radius = radius;
    }
    
    public Kreis(Punkt bezug)
    {
        this(bezug, DEFAULT_RADIUS);
    }
    
    public double umfang()
    {
        return 2 * Math.PI * this.radius;
    }
    
    public double flaeche()
    {
        return Math.PI * this.radius * this.radius;
    }
}
