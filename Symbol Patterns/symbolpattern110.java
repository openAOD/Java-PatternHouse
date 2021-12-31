class Main 
{     
    public static void main(String[] args) 
        {
        int n=5;
        for(int i=0;i<n;i++)
        {
          for(int j=1; j<n-i; j++)
          System.out.print("*");

          for(int k=i; k<2*i+1; k++)
          {
          System.out.print(k+1);
          if (k+1 == 2*i+1)
          {
            for(int a=k; a>i; a--)
            System.out.print(a);
            break;
          }
          }
          for(int l=n-i; l>1; l--)
          System.out.print("*");
          
          System.out.println();
          }
       }  
    }
