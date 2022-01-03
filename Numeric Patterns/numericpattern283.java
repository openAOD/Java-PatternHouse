public class Main
{
    public static void main(String[] args) {
		
    int size=5;
    int flag=size/2;;

    for(int i=0; i<size;i++){

        //Middle row of numbers
        if(i==size/2){
            for(int j=1;j<4;j++)
                System.out.print(j+" ");
             System.out.println();
        }

        //Upper half of stars
        else if(i<size/2){
            for(int j=0;j<=i;j++)
                 System.out.print("*"+" ");
            System.out.println();
        }

        //Lower half of stars
        else{
            for(int j=0;j<flag;j++)
                System.out.print("*"+" ");
            flag--;
            System.out.println();
        }

    }
  
	}
}