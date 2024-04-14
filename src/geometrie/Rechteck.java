package geometrie;

import java.lang.Math;

public class Rechteck extends Figur2D
{
    private int breite;
    private int laenge;
    
    public int getBreite()
    {
        return this.breite;
    }
    
    public int getLaenge()
    {
        return this.laenge;
    }
    
    public void setBreite(int x)
    {
        if (x < 1)
        {
            return;
        }

        this.breite = x;
    }
    
    public void setLaenge(int x)
    {
        if (x < 1)
        {
            return;
        }

        this.laenge = x;
    }
    
    public Rechteck(Punkt bezug, int b, int l)
    {
        super(bezug);
        
        if (b < 1 || l < 1)
        {
            this.breite = 1;
            this.laenge = 1;
            return;
        }
        
        this.breite = b;
        this.laenge = l;
    }
    
    public double diagonalenLaenge()
    {
        return Math.sqrt((this.breite * this.breite) + (this.laenge * this.laenge));
    }
    
    public boolean flaecheKleinerAls(Figur2D f)
    {
        if (this.flaeche() < f.flaeche())
        {
            return true;
        }
        
        return false;
    }
    
    public boolean umfangKleinerAls(Figur2D f)
    {
        if (this.umfang() < f.umfang())
        {
            return true;
        }
        
        return false;
    }
    
    public double umfang()
    {
        return this.breite * 2 + this.laenge * 2;
    }
    
    public double flaeche()
    {
        return this.breite * this.laenge;
    }
}
