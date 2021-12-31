class Main 
{     
   public static void main(String[] args) 
        {
        int n=5;
        for(int i=0;i<n;i++)
        {
          for(int j=n; j>i; j--)
          System.out.print(" ");

          for(int k=0; k<i+1; k++)
          {
            if (k==0 | i==n-1)
                System.out.print("*");
            else 
                System.out.print(" ");    
          }
          for(int m=0; m<i; m++)
          {
            if (m==i-1 | i==n-1)
                System.out.print("*");
            else 
                System.out.print(" "); 
          }
          System.out.println();
          }
     }  
}   
