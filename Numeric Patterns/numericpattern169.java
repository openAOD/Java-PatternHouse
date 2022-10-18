class Main
{
  public static void main (String[]args)
  {
     int n = 5;
    for(int i = 1; i < n; i++) {
        for(int j = 1; j < i * 2; j++) {
            if(j < i)
                System.out.print((n + j - i) + " ");
            else if(j == i)
                System.out.print("0"+" ");
            else
                System.out.print((n - j + i)+" ");
        }
        System.out.println();
    }
  }
}