package polymorphism;

public class MainOverriding {

    public static void main(String args[])
    {   //Method Overriding

        Shapes obj = new Circle();
        obj.area();
        
        Triangle obj2 = new Triangle();
        obj2.area();
    }
    
}

//We cannot override static methods.
//Since static variables are tied to the class so there is no point of overriding them in child class. So those method will run no matter from which object you call it.

