public class Main
{
	public static void main(String[] args) {
		
    int height=5;
    int size=9;
    int obj=0;
    char chr='A';

  for(int i=0;i<height;i++){
      for(int j=0;j<=size-1;j++){
          if(j==i || j==size-1-obj){
              System.out.print(chr+" ");
          }
          else
             System.out.print(" "+" ");
      }
      obj++;
      chr++;
       System.out.println();
  }
	
	}
}