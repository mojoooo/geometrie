package aufgabe;

import geometrie.*;

public class AufgabePool
{
    private Quader q;
    private Zylinder z1;
    private Zylinder z2;
    private Zylinder z3;
    private Kreis k1;
    private Kreis k2;
    private Kreis k3;
    private Rechteck r;
    
    private static final int HOEHE = 2;
    
    public Quader getQ()
    {
        return this.q;
    }
    
    public Zylinder getZ1()
    {
        return this.z1;
    }
    
    public Zylinder getZ2()
    {
        return this.z2;
    }
    
    public Zylinder getZ3()
    {
        return this.z3;
    }
    
    public Kreis getK1()
    {
        return this.k1;
    }
    
    public Kreis getK2()
    {
        return this.k2;
    }
    
    public Kreis getK3()
    {
        return this.k3;
    }
    
    public Rechteck getR()
    {
        return this.r;
    }
    
    public void setQ(Quader q)
    {
        this.q = q;
    }
    
    public void setZ1(Zylinder z)
    {
        this.z1 = z;
    }
    
    public void setZ2(Zylinder z)
    {
        this.z2 = z;
    }
    
    public void setZ3(Zylinder z)
    {
        this.z3 = z;
    }
    
    public void setK1(Kreis k)
    {
        this.k1 = k;
    }
    
    public void setK2(Kreis k)
    {
        this.k2 = k;
    }
    
    public void setK3(Kreis k)
    {
        this.k3 = k;
    }
    
    public void setR(Rechteck r)
    {
        this.r = r;
    }
    
    public AufgabePool()
    {
        Punkt p1 = new Punkt(791, 390);
        Punkt p2 = new Punkt(949, 390);
        Punkt p3 = new Punkt(0, 222);
        Punkt p4 = new Punkt(148, 222);
        Punkt p5 = new Punkt(0, 390);
        Punkt p6 = new Punkt(148, 390);
        Punkt p7 = new Punkt(74, 390);
        
        this.setK1(new Kreis(p1, (int) p1.abstand(p2)));
        this.setK2(new Kreis(p5, (int) p5.abstand(p6) / 2));
        this.setK3(new Kreis(p3, (int) p3.abstand(p4) / 2));
        
        this.setR(new Rechteck(p7, 316, 875));
        
        this.setQ(new Quader(r, HOEHE));

        this.setZ1(new Zylinder(k1, HOEHE));
        this.setZ2(new Zylinder(k2, HOEHE));
        this.setZ3(new Zylinder(k3, HOEHE));
    }
    
    public double poolVolumen()
    {
        return this.getQ().volumen() + ((this.getZ1().volumen() + this.getZ2().volumen() + this.getZ3().volumen()) / 2);
    }
    
    public double poolUmfang()
    {
        return ((this.getK1().umfang() + this.getK2().umfang() + this.getK3().umfang()) / 2) + (this.getR().getLaenge() * 2) + (this.getR().getBreite() - (this.getK2().getRadius() * 4));
    }
    
    public double poolInnererMantel()
    {
        return this.poolWasserOberflaeche() + this.poolUmfang() * HOEHE;
    }
    
    public double poolWasserOberflaeche()
    {       
        return this.getR().flaeche() + ((this.getK1().flaeche() + this.getK2().flaeche() + this.getK3().flaeche()) / 2);
    }
    
    public double kostenZaun(double preisProStueck)
    {
        return Math.ceil(this.poolUmfang() / 5) * preisProStueck;
    }
}
