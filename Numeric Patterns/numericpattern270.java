public class Main
{
  public static void main (String[]args)
  {
    
     int n = 7, x = n/2, y = 1;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= x; j++) 
            System.out.print("  ");

        for(int k = 1; k <= y; k++)
             System.out.print(k+" ");

        if(i <= n/2) {
            x--;
            y += 2;
        }
        else {
            x++;
            y -= 2;
        }
         System.out.println();
    }
    
    
  }
}