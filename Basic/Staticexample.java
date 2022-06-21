package Basic;
//Static keyword belongs to the class rather than the object
//Refers to the common property, by that we save memory because static variable is instantiated only once.
// Static method can only access static data 


class Student{  
    int rollno; 
    String name;  
    static String college ="XLRI";//static variable  
   
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
    //Cannot use this in a static method because this is related to object and static is not dependent on obect
    //static void display1 (){System.out.println(this.rollno+" "+this.name+" "+college);} 
 }  
 //Test class to show the values of objects  
 public class Staticexample{  
  public static void main(String args[]){  

  Student s1 = new Student(111,"Karan");  
  Student s2 = new Student(222,"Aryan");   
  s1.display();  
  s2.display();  
//cannot call it directly because the method is a static method which can only use static data. display1();  
}
//void display (){System.out.println(rollno+" "+name+" "+college);}  
//void display1 (){System.out.println(rollno+" "+name+" "+college);}  
 }  


