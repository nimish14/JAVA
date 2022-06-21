package Interfaces;

public class Main {
    public static void main(String[] args) {
        
    
   Car c = new Car(); 
   c.start();
   c.stop();
   c.accelerate();
   c.brake();
   c.start_media();
   c.stop_media();

   TeslaCar tc = new TeslaCar(); 
   tc.start();
   tc.stop();
   tc.accelerate();
   tc.brake();
   tc.start_media();
   tc.stop_media();

   Electricengine ee = new Electricengine();
   ee.start();
   ee.accelerate();
   ee.stop();
}
}
