package Interfaces;

//Multiple Inheritance
public class Car implements Brake,Engine,Media

{
    @Override
 public void brake()
 {
System.out.println("Normal car's Brake installed");
 }

@Override
public void start_media() {
   
  System.out.println("Normal car's Media Started");
    
}

@Override
public void stop_media() {
  
  System.out.println("Normal car's Media stopped");
}

@Override
public void start() {
    // TODO Auto-generated method stub
    System.out.println(" Normal Car started");    
}

@Override
public void stop() {
    // TODO Auto-generated method stub
    System.out.println("Normal Car stopped");
}

@Override
public void accelerate() {
    // TODO Auto-generated method stub
    System.out.println("Normal Car accelerated");
}   
}

