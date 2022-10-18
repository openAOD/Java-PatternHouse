class Main
{
	public static void main(String[] args) { 
	    
    int size=5;
    int chr=size-1;

    for(int i=0;i<size;i++){
        for(int j=0;j<size-1;j++){

            //Print first row
            if(i==0){
               System.out.print("*"+" "); 
            }

            //Print subsequent rows
            else{

                if(j==chr)
                    System.out.print("*"+" ");

                else
                    System.out.print(" "+" ");
            }
        }
        chr--;
        System.out.println();
    }
		
	}
}
