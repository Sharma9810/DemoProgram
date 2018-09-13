import java.util.*;
import java.lang.*;
class Main 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter 1st String: ");
     String s1=sc.next();
     System.out.print("Enter 2nd String: ");   
     String s2=sc.next(); 
     int lastIndex = 0;
     int count = 0;
     while(lastIndex != -1)
     {
        lastIndex = s1.indexOf(s2,lastIndex);
        if(lastIndex != -1)
        {
          count ++;
          lastIndex += s2.length();
        }
     }
     if(count==0)
     {
       System.out.println("Not Found!!");
     }
     else
     {
       System.out.print("Found!");
     }
  }
}