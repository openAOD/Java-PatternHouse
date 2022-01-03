public class Main
{
    public static void printTriangle(int n){

         for(int i=0;i<3;i++){
        for(int j=1;j<=i+1;j++){
            System.out.print(j+" ");
        }
         System.out.println();
    }

    }
    
	public static void main(String[] args) {
		
        int size=2;

        for(int i=1; i<size+1; i++){
            printTriangle(i);
        }
  
	}
}