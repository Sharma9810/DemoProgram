import java.util.Scanner;
import java.lang.*;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String s;
    StringBuilder s1=new StringBuilder();
    System.out.print("Enter the String: ");
    s=sc.next();
    s1=s1.append(s);
    s1=s1.reverse();
    System.out.print("The reversed string: "+s1);
  }
}