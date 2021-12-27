class Main 
{     
    public static void main(String[] args) 
        {
        int n=5;
        for(int i=0;i<n;i++)
        {
          int j=-1;
          for(j=0; j<n-i-1; j++)
          System.out.print(" ");

          for(int k=0; k<2*i+1; k++)
          {
            if ((j+k) % 2!=0)
            System.out.print("*");
            else 
            System.out.print('#');
          }
          System.out.println();
          }
        }  
    }   
