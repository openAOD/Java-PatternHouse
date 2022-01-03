public class Main
{
    public static void printTriangle(int n){

        for(int i=1;i<4;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
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