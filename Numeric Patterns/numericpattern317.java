public class Main
{
    public static void main(String[] args) {
		
   int size=5;

    for(int i=0;i<size;i++){
        if(i%2==0){
            for(int j=0;j<size;j++){
                System.out.print("*"+" ");
            }    
            System.out.println();
        }

        else{
             for(int j=0;j<size;j++){
                if(j==0 || j==size-1)
                   System.out.print("*"+" ");
                else
                   System.out.print(" "+" ");
            }    
            System.out.println();
        }
    }

  
	}
}