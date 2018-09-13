class Main 
{
  public static void main(String[] args) 
  {
    String s="xyz";
    int n=s.length();
    System.out.println("Entered String: "+s);
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<=n;j++)
      {
        System.out.println("Substring: "+s.substring(i,j));
      }
    }
  }
}