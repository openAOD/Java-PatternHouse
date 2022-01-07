public class Main
{
  public static void main (String[]args)
  {
    
     int n = 7, x = 1;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            if((j <= x || j > n - x) && j <= n/2) 
                System.out.print(j+" ");
            else if((j <= x || j > n - x) && j > n/2)
                System.out.print((n - j + 1) + " ");
            else
                System.out.print("  ");
        }
        if(i <= n /2) 
            x++;
        else 
            x--;
        System.out.println();
    }
    
    
  }
}