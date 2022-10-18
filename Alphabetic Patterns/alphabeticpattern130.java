class Main
{
  public static void main (String[]args)
  {

    int n = 3;
    for (int i = n; i >= -n; i--)
      {
    	for (int j = 0; j <= java.lang.Math.abs(i); j++)
    	  System.out.print ((char) (j + 65) + " ");
	    System.out.println();
      }

  }
}