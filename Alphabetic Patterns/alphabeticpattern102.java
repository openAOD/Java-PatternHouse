public class Main
{
	public static void main(String[] args) {
		
	 int height=5;
    int size=9;
    int mid=size/2;
    int obj=0;
    char chr='E';

  for(int i=0;i<height;i++){
      for(int j=0;j<=size-1;j++){

          if(j==mid-obj || j==mid+obj){

            if(obj==0){
            //print first row 
              System.out.print(chr);
              break;
            }

            //print subsequent rows
            System.out.print(chr+" ");
          }
          else
            System.out.print(" "+" ");
      }
      obj++;
      chr--;
      System.out.println();
  }
	
	}
}
