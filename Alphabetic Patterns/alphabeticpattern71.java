public class Main
{
  public static void main (String[]args)
  {
    
      int n = 5;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= 2*(n - i + 1); j++) {
            if(i + j <= n + 1)
                System.out.print((char)(64 + j) + " ");
            else 
                System.out.print((char)(65+(2*(n-i+1)-j))+" ");
        }
        System.out.println();
    }
  
  }
}