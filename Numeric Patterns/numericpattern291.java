class Main
{
  public static void main (String[]args)
  {
    
     int n = 3;
    for(int i = n; i >= -n; i--) {
        for(int j = java.lang.Math.abs(i); j >= 0 ; j--) 
            System.out.print(j+" ");
        System.out.println();
    }
    
    
  }
}