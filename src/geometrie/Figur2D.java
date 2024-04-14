package geometrie;

public abstract class Figur2D
{
    private Punkt bezug;
    
    public Punkt getBezug()
    {
        return this.bezug;
    }
    
    public void setBezug(Punkt p)
    {
        this.bezug = p;
    }
    
    public Figur2D(Punkt bezug)
    {
        this.bezug = bezug;
    }
    
    public Figur2D(int bezugX, int bezugY)
    {
        Punkt bezugsPunkt = new Punkt(bezugX, bezugY);
        
        this.bezug = bezugsPunkt;
    }
    
    public abstract double umfang();
    
    public abstract double flaeche();
}
