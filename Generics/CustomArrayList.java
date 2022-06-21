package Generics;

import java.util.ArrayList;
//import java.util.*;
public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;
    
    CustomArrayList()
    {
      this.data = new int[DEFAULT_SIZE];
    }



    public void add(int num)
{
    if (isFull())
    {
        resize();
    }
     data[size++]= num; 
}
   

private void resize() 
    {
     int temp[] = new int[data.length*2];
     for(int i=0 ; i<data.length*2;i++)
     {
       temp[i] = data[i];
    data=temp;
    }
    }

    
    private boolean isFull() {
        return (size == data.length);
    }

    public static void main(String[] args) {
    ArrayList list = new ArrayList();
  //CustomArrayList obj = new CustomArrayList();
  list.add(2);
list.add(3);
System.out.println(list);}    
}
