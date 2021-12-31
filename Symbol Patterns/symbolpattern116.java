class Main 
{     
   public static void main(String[] args) 
        {
        int n=7;
        int a=n/2+1;
        for(int i=0;i<a;i++)
        {
           for(int j=0; j<i+1; j++)
           {
             if (j==i | j==0)
               System.out.print(" *");
             else
               System.out.print("  ");
           }
           System.out.println();
        }
        for(int i=n-a; i>0; i--)
        {
            for(int m=0;m<i;m++)
           {
             if (m==0| m==i-1)
                System.out.print(" *");
             else 
                System.out.print("  "); 
           }
            System.out.println();
       }
    }  
}   
