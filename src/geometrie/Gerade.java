package geometrie;

public class Gerade
{
    private Punkt startPos;
    private Punkt endPos;
    
    public Punkt getStartPos()
    {
        return this.startPos;
    }
    
    public Punkt getEndPos()
    {
        return this.endPos;
    }
    
    public void setStartPos(Punkt p)
    {
        this.startPos = p;
    }
    
    public void setEndPos(Punkt p)
    {
        this.endPos = p;
    }
    
    public Gerade(Punkt start, Punkt ende)
    {
        this.startPos = start;
        this.endPos = ende;
    }
    
    public double laenge()
    {
        return this.getEndPos().abstand(this.getStartPos());
    }
    
    public boolean istLaengerAls(Gerade g2)
    {        
        return this.laenge() > g2.laenge();
    }
    
    public boolean equals(Gerade g2)
    {
        /**
         * Wann ist eine Gerade gleich einer anderen Geraden?
         * Nur wenn die laenge gleich ist
         * oder müssen laenge und pos übereinstimmen?
         */

        //if (this.laenge() == g2.laenge())
        if (this.getStartPos().equals(g2.getStartPos()) && this.getEndPos().equals(g2.getEndPos()))
        {
            return true;
        }
        
        return false;
    }
}
