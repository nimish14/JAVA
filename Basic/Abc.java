package Basic;

import java.util.Scanner;
public class Abc {
    
    public static void main(String[] args)
    { 
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the limit");
int lim = sc.nextInt();
int a=0, b=1, sum = 0;
sum = a+b;

System.out.println(a);
System.out.println(b);
System.out.println(sum);
for (int i=1;i<=lim;i++)
{
  System.out.println(sum);
  a=b;
  b=sum;
  sum=a+b;
}
sc.close();
    }}

