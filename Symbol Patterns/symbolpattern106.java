class Pattern 
{     
        public static void main(String[] args) 
        {
        for(int i=0;i<5;i++)
        {
          for(int j=5;j>i;j--)
          System.out.print("*");
          for(int k=0;k<i;k++)
          System.out.print(" ");
          if (i>0)
          {
          for(int k=0;k<i-1;k++)
          System.out.print(" ");
          }
          for(int l=i;l<5;l++)
          {
            if (i==0 && l==0) continue;
            System.out.print("*");
          }
          System.out.println();
        }

        
    }
}
