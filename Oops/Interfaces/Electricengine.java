package Interfaces;

public class Electricengine implements Engine{
    @Override
public void start() {
    // TODO Auto-generated method stub
    System.out.println(" Electric Car engine started");    
}

@Override
public void stop() {
    // TODO Auto-generated method stub
    System.out.println("Electric Car engine stopped");
}

@Override
public void accelerate() {
    // TODO Auto-generated method stub
    System.out.println("Electric Car engine accelerated");
} 
    
}
