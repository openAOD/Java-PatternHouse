class Main
{
	public static void main(String[] args) {
	int n=5;
    int[][] arr = new int[n][n];
    int x=1, y=1;
    while(x<=n){
        for(int i=x-1; i<n; i++){
            for(int j=y-1; j<n; j++)
                arr[i][j]=x;
        }
        x++; y++;
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++)
            System.out.print(arr[i][j]+" ");
        System.out.println();
    }
		
	}
}