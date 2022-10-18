class Main
{
  public static void main (String[]args)
  {
    int n = 4, numb = 1;
    for (int i = n; i >= -n; i--)
      {
	for (int j = 1; j <= java.lang.Math.abs (i); j++)
	  System.out.print (" ");
	numb = 1;
	for (int k = n; k >= java.lang.Math.abs (i); k--)
	  System.out.print (" " + numb++);
	System.out.println ();
      }
  }
}