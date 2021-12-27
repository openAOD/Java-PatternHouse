class Main 
{     
   public static void main(String[] args) 
        {
        int n=5;
        for(int i=0;i<n;i++)
        {
          for(int j=2*n; j>i; j--)
          System.out.print(" ");

          for(int k=0; k<i+1; k++)
          System.out.print("* ");

          System.out.println();
        }
        for (int i=0;i<n;i++)
        {
          for(int j=n;j>i;j--)
          System.out.print(" ");  
            
          for(int k=0;k<i+1;k++)
          System.out.print("* ");
            
          for (int l=i+1;l<n;l++)
          System.out.print("  ");
            
          for(int m=0;m<i+1;m++)
          System.out.print("* ");
              
          System.out.println();
          }
     }  
}   
