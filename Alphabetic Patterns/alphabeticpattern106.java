class Main
{
	public static void main(String[] args) {
		
   int height=5;
    int size=9;
    int obj=0;
    char chr1='A';
    char chr2='I';

  for(int i=0;i<height;i++){
      for(int j=0;j<=size-1;j++){
          if(j==i || j==size-1-obj){
              if(j==i)
               System.out.print((chr1++)+" ");
              else //j==size-1-obj
               System.out.print((chr2--)+" ");
          }
          else
            System.out.print(" "+" ");
      }
      obj++;
      System.out.println();
  }
  
	}
}