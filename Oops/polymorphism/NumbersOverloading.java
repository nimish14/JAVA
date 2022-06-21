package polymorphism;

public class NumbersOverloading {
//Method Overloading

    int sum (int a , int b)
    {return a+b;}

    int sum(int a, int b, int c)
    {
        return a+b;
    }

    public static void  main(String[] args) {
        NumbersOverloading obj = new NumbersOverloading();
        System.out.println(obj.sum(2,3));

        System.out.println(obj.sum(5,6,4));

    }
    
}
