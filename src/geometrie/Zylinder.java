package geometrie;

public class Zylinder extends Figur3D
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
    
    public Kreis getBoden()
    {
        Figur2D boden = super.getBoden();
        
        return (Kreis) boden;
    }
    
    public void setBoden(Kreis k)
    {
        super.setBoden(k);
    }
    
    public Zylinder(Kreis k, int hoehe)
    {
        super(k);
        
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
}
