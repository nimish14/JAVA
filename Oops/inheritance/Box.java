package inheritance;
// Example of polymorphism(Method Overloading) also

public class Box {
 double l;
 double b;
 double h;
 
 Box(){
    this.l=-1;
    this.b=-1;
    this.h=-1;
 }
 //Cube
 Box(double side)
 {
    this.l=side;
    this.b=side;
    this.h=side;
 }

 Box(double l,double b,double h)
{
    this.l=l;
    this.b=b;
    this.h=h;
}
public void information()
{
System.out.println("Box is running");
}
}


