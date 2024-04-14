package geometrie;

public abstract class Figur3D
{
    private Figur2D boden;
    
    public Figur2D getBoden()
    {
        return this.boden;
    }
    
    public void setBoden(Figur2D f)
    {
        this.boden = f;
    }
    
    public Figur3D(Figur2D f)
    {
        this.boden = f;
    }
    
    public abstract double volumen();
    
    public abstract double oberflaeche();
}
