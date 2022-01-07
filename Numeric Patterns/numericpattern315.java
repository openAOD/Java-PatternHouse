public class Main
{
	public static void main(String[] args) {
	    
    int size=5;
    int top=0;
    int bottom=size-1;

    for(int i=0;i<5;i++){

        if(i%2==0){
            for(int j=0;j<5;j++)
                System.out.print("*"+" ");
            System.out.println();
        }

        else{
            if(i==top+1){
                System.out.println("*"+" ");
                continue;
            }
            else if(i==bottom-1){
                for(int j=0;j<5;j++)
                    if(j==size-1 || j==0)
                        System.out.print("*"+" ");
                    else
                        System.out.print(" "+" ");
            System.out.println();
            }
        }
    }
		
	}
}
