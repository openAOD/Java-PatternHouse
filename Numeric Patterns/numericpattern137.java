class Main
{
	public static void main(String[] args) {
		
	int n=4;

    int k=1;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print(k++ + " ");
            if(k%8==0)
                k+=2;
        }
       System.out.println();
    }
		
	}
}