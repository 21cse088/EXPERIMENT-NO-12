    
import java.util.*;  
public class searchingelement{
public static void main(String[] args) {
        Integer num[]={44,55,66,77};
        search<Integer,Integer> obj=new search<>();
        obj.search(15, num);
        String str[]={"program","cse","key"};
        search<String,String> obj1=new search<>();
        obj1.search("cse", str);
    }
}
class search<T,V>
{
    boolean flag=false;
    public  <T,V> void search(T str,V[] value)
    {
        for(int i=0;i<value.length;i++)
        {
            if(str.equals(value[i]))
            {
                flag= true;
                break;
            }
            else
                flag=false;      
        }
        if(flag)
            System.out.println("searching element is found");
        else
            System.out.println("searching element is not found");
    }
}     
  


    

