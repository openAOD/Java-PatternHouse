public class Main
{
  public static void main (String[]args)
  {

       int n = 4, num = 1;
    for(int i = n; i >= -n; i--) {
        for(int j = 1; j <= java.lang.Math.abs(i); j++) 
            System.out.print(" ");

        for(int k = n; k >= java.lang.Math.abs(i); k--)
            System.out.print(" "+num);

        if(i > 0) 
            num++;
        else 
            num--;

        System.out.println();
    }
      
  }
}