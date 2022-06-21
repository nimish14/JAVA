package inheritance;

public class Boxweight extends Box 
{
double weight;
    Boxweight()
    {
        this.weight= 1;
    }
public Boxweight(double l,double b,double h, double weight)
{
    super(l, b, h); //Call the parent class constructor
    this.weight=weight;
    super.information();
}

    
}


