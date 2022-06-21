package Basic;
//Outside class cannot be static
public class InnerClasses {
//Inner class can be static/non static    
    static class Test{
        String name;
        Test(String name)
        {
            this.name=name;
        }
    }

public static void main(String args[])
{
//InnerClasses obj = new InnerClasses();
//InnerClasses.Test obj2 = obj.new Test("Nimish");


Test obj = new Test("Nimish");
System.out.println(obj.name);




}


  }  

