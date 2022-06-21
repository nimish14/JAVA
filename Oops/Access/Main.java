package Access;

public class Main {

    public static void main(String[] args)
    {

A obj = new A(2,1,"nimish");

//Check if an object is an instacne of a class or not
//System.out.println(obj instanceof A);
//System.out.println(obj instanceof Object);

//used to get the information about current objects class.
System.out.println(obj.getClass());

  //System.out.println(obj.a);
  // If we keep value of a in another class private, it wont be able to access it here and throw an error.
  // if using private , we can access its value here using getter and setter methods.

  System.out.println(obj.get());
  System.out.println(obj.set(3));
  
    }

    
    
}
