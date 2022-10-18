class Main
{
	public static void main(String[] args) {
		
		int n=5;

    int k=1;
    for(int i=0; i<n; i++){
        if(i%2==0){
            for(int j=1; j<=n; j++){
                System.out.print(k++ + " ");
            }
            k+=n-1;
        }
        else{
            for(int j=n; j>0; j--){
                System.out.print(k-- + " ");
            }
            k+=n+1;
        }
        System.out.println();
    }
		
		
	}
}