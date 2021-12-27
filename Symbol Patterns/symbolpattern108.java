class Main 
{     
    public static void main(String[] args) 
        {
        int n=5;
        for(int i=0; i<n; i++)
        {
          for(int j=i; j<n-1; j++)
          System.out.print(" ");
            
          for(int k=0; k<i+1; k++)
          System.out.print("* ");
            
          for(int l=i+1; l<n; l++)
          System.out.print("  ");
            
          for(int m=0; m<i+1; m++)
          System.out.print("* ");
                 
          System.out.println();
        }
      }  
    }
