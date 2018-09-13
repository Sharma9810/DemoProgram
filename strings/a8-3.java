import java.util.*;
import java.lang.*;
class Main 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the String: ");
     String s=sc.next();   
     System.out.println("Entered String: "+s);
     s=s.replaceAll("[aeiouAEIOU]","");
     System.out.println("String without vowels: "+s);
  }
}