package geometrie;

import java.lang.Math;

public class Punkt
{
    private int x;
    private int y;
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Punkt(Punkt p2)
    {
        this.x = p2.x;
        this.y = p2.y;
    }
    
    public double abstand(Punkt p)
    {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    
    public void verschieben(int deltaX, int deltaY)
    {
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + deltaY);
    }
    
    public boolean equals(Punkt p1)
    {
        /*
        if (this.getX() == p1.getX() && this.getY() == p1.getY())
        {
            return true;
        }

        return false;
        */
        return this.abstand(p1) == 0;
    }
}
