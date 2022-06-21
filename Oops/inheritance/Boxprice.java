package inheritance;

public class Boxprice extends Boxweight {
    double cost;
    Boxprice()
    {    super();
        this.cost =1;
        
    }
    Boxprice(double l,double b,double h, double weight, double cost)
{
super(l,b,h,weight);
this.cost=cost;
super.information();
}    
}
