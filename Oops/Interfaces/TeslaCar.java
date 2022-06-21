package Interfaces;

//Multiple Inheritance
public class TeslaCar implements Brake,Engine,Media

{
    @Override
 public void brake()
 {
System.out.println("Tesla car's Brake installed");
 }

@Override
public void start_media() {
   
  System.out.println("Tesla car's Media Started");
    
}

@Override
public void stop_media() {
  
  System.out.println("Tesla car's Media stopped");
}

@Override
public void start() {
    // TODO Auto-generated method stub
    System.out.println(" Tesla Car started");    
}

@Override
public void stop() {
    // TODO Auto-generated method stub
    System.out.println("Tesla Car stopped");
}

@Override
public void accelerate() {
    // TODO Auto-generated method stub
    System.out.println("Tesla Car accelerated");
}   
}

