package geometrie;

import java.lang.Math;
import java.util.Objects;

public class Quader extends Figur3D
{
    private int hoehe;
    
    public int getHoehe()
    {
        return this.hoehe;
    }
    
    public void setHoehe(int h)
    {
        if (h < 1)
        {
            return;
        }

        this.hoehe = h;
    }
    
    public Rechteck getBoden()
    {
        Figur2D boden = super.getBoden();
        
        return (Rechteck) boden;
    }
    
    public void setBoden(Rechteck r)
    {
        super.setBoden(r);
    }
    
    public Quader(Rechteck r, int hoehe)
    {
        super(r);
        if (hoehe < 1)
        {
            this.hoehe = 1;
            return;
        }

        this.hoehe = hoehe;
    }
    
    public double volumen()
    {        
        return this.getBoden().flaeche() * this.hoehe;
    }
    
    public double oberflaeche()
    {      
        return this.getBoden().flaeche() * 2 + this.getBoden().umfang() * this.hoehe;
    }
    
    public double laengeRaumdiagonale()
    {
        double diagonale = this.getBoden().diagonalenLaenge();
        
        return Math.sqrt(diagonale * diagonale + this.hoehe * this.hoehe);
    }
    
    public static boolean istWuerfel(Object o)
    {
        if (o instanceof Quader)
        {
            Rechteck oBoden = ((Quader) o).getBoden();
            int oHoehe = ((Quader) o).getHoehe();
            
            if (oBoden.getBreite() == oBoden.getLaenge() && oBoden.getBreite() == oHoehe)
            {
                return true;
            }
        }

        return false;
    }
    
    public boolean equals(Figur3D f)
    {
        /**
         * Wann ist ein Quader einem anderen Körper gleich?
         */
        
        if (this.getBoden().getBezug().getX() == f.getBoden().getBezug().getX() 
                && this.getBoden().getBezug().getY() == f.getBoden().getBezug().getY())
        {
            return true;
        }
        
        return false;
    }
}
