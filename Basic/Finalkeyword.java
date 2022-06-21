package Basic;
public class Finalkeyword {
    public static void main(String[] args)

    {
         // Value of a final primitive data type cannot change
         
         //final int a =10;

         //Will throw and error
         //  a=20;\
        
         // Incase of non primitive type, you cannot reassign its value
         // We can change the value of object vut cannot reassign it to new object
          final A obj = new A();
          obj.show("AIsh");
          obj.show("nim");
         
        // i cannot reassign it to another object
        //  A obj2 = new A();
        // Will throw ans error here now
        // obj =obj2;
        }
}

class A{

    void show(String name)
    {
        System.out.println("Hiiii"+ name);

    }
 //@Override
 //protected void finalize() throws Throwable {
     // TODO Auto-generated method stub
   //  super.finalize();
     //System.out.println("Object is destroyed");
 //}
}
