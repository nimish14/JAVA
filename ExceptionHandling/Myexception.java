package ExceptionHandling;

public class Myexception extends Exception {

    Myexception(String message)
    {super(message);}

    public static void main(String[] args) throws Myexception
    {
        String name = "Nimish";
        if(name.equals("Nimish"))
        { throw new Myexception("Error Occured");}
    }
}
