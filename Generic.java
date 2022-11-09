
package generic;
import java.util.*;
import java.lang.Comparable;
import static java.lang.Integer.max;
public class Generic {
public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       System.out.println("enter array size:");
       int n=obj.nextInt();
       Integer num[]=new Integer[n];
       System.out.println("enter array element:");
       for(int i=0;i<n;i++)
       {
           num[i]=obj.nextInt();
       }
       System.out.println("Odd element:");
       demo<Integer> obj1=new demo<>(num);
       obj1.odd();
       obj1.display();
       System.out.println("\nenter the value of x:");
       Integer x=obj.nextInt();
       System.out.println("enter the value of y:");
       Integer y=obj.nextInt();
       obj1.swap(x, y);
       System.out.println("array:");
       obj1.display();
      System.out.println("Maximum element is:"+ max(Integer.valueOf(96),Integer.valueOf(22)));
    } 
}
class demo<T>
{
    T[] value;
    public demo(T[] value)
    {
        this.value=value;
    }
    public void odd()
    {
        int count=0;
        for(int i=0;i<value.length;i++)
        {
            int s=(Integer)value[i];
            if(s%2!=0)
            {
                count++; 
            }
        } 
      System.out.println(count);
  }
    public void swap(T x,T y)
    {
        int xp=0;
        int yp=0;
        for(int i=0;i<value.length;i++)
        {
            if(value[i]==x)
            {
                xp=i;
            }
            if(value[i]==y)
            {
                yp=i;
            }
        }
        value[xp]=y;
        value[yp]=x;
    }         
    public void display()
    {
        for(int i=0;i<value.length;i++)
        {
            System.out.print(value[i]+" ");
        }
    }
    public static<T extends Comparable<T>> T max(T... elements)
    {
       T max=elements[0];
         for(T element:elements){
             if(element.compareTo(max)>0) 
             {
                 max=element;
             } 
        }
    return max;
    }
}
