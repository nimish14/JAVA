package Basic;

class demo1 {

int rno;
String name;
float marks;

demo1()
{
rno = 1;
name = "nimi";
marks= 123;

}
demo1( int rno, String naam, int mark)
{
this.rno = rno;
this.name= naam;
this.marks=mark;
}


void namee()
{
     System.out.println(name);
     System.out.println(rno);
     System.out.println(marks);
}
}

//Main Class
class ConstructorExample{
public static void main(String[] args) {
    demo1 obj = new demo1();
    System.out.println(obj);
    //demo1 obj2 = new demo1(5,"jdnfsj",5);
    //obj.namee();
    //obj2.namee();
  }
}


