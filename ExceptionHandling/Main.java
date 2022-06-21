package ExceptionHandling;

public class Main {

    public static void main(String[] args) {
                
        int a = 5;
        int b=0;
     try{
        div(a, b);
        int c=a/b;

        throw new ArithmeticException(); // Explicitly throwing an exception 
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());

    }
 //   catch(Exception e)
   // {
     //   System.out.println("Another Exception handled");
    //}
    catch(ArithmeticException e)
    {
        System.out.println(e.getMessage());

    }




}

    static int div(int a, int b) throws ArithmeticException
    { //if (b==0)
        //{throw new ArithmeticException("Error");}
return a/b;

    }
    
    //finally{
      //  System.out.println("This will always execute");
   // }


}
