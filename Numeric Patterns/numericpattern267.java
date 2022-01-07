public class Main
{
  public static void main (String[]args)
  {

       int n = 4, num = 1;
    for(int i = n; i >= -n; i--) {
        for(int j = 1; j <= java.lang.Math.abs(i); j++) 
            System.out.print(" ");
            
        if(i >= 0) 
            num = 1;
        else 
            num = java.lang.Math.abs(i) + 1;

        for(int k = n; k >= java.lang.Math.abs(i); k--)
            System.out.print(" "+num++);

        System.out.println();
    }
      
  }
}