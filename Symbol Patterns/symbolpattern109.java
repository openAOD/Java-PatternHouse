class Main 
{     
    public static void main(String[] args) 
        {
        int n=4;
        for(int i=0;i<n;i++)
        {
          for(int j=1; j<n-i+1; j++)
          System.out.print(j);
            
          for(int k=0; k<2*i+1; k++)
          System.out.print("*");
            
          for(int l=n-i; l>0; l--)
          System.out.print(l);
          
          System.out.println();
        }
        for(int j=0;j<2*n+1;j++)
          System.out.print("*");  
      }  
        
    }
