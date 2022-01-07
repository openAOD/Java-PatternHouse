public class Main
{
  public static void main (String[]args)
  {
    int n = 4, x = 0;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j < i * 2; j++) {
            if(j <= i)
                System.out.print((j + x) + " ");
            else
                System.out.print((i*2 - j + x) +" ");
        }
        x+=i;
        System.out.println();
    }
  }
}