package Basic;

//import java.security.cert.PKIXCertPathValidatorResult;

public class WrapperExample {
public static void main(String args[])
{

    int a=10;
    //Integer class is final
  //  Integer num =10;
    int b=20;

swap(a,b);
System.out.println(a+ " "+ b);
}

static void swap(int a, int b)
{
 int temp=a;
 a=b;
 b=temp;

}
}
