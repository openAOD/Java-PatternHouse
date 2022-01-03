public class Main
{
    public static void printTriangle(int n){

         for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(n+" ");
        }
         System.out.println();
    }

    }
    
	public static void main(String[] args) {
		
        int size=3;

        for(int i=1; i<size+1; i++){
            printTriangle(i);
            System.out.println();
        }
  
	}
}