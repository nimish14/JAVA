package inheritance;

public class Main {
    public static void main(String args[])
    {
       //Single Inheritance
       //Complie time polymorphism
       Boxweight obj = new Boxweight();
       System.out.println(obj.l+obj.b+obj.h+obj.weight);
       obj.information();
       System.out.println("Boxweight inherited information function");

      //Multilevel inheritance
      Boxprice obj2 = new Boxprice();
      System.out.println(obj2.l+obj2.b+obj2.h+obj2.weight+obj2.cost);
      obj2.information();
      System.out.println("Boxprice inherited information function");
      
      //Hierarchical Inheritance
      Boxinfo obj3 = new Boxinfo();
     // obj3.information();
      obj3.info();


    }
    
}
