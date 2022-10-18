class Main
{
	public static void main(String[] args) {
		
 int n=4;

    int k=1;
    char ch='a';
    boolean dig=true;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(dig){
                System.out.print(k++ + " ");
                if(k%10==0)
                    dig=false;
            }
            else{
                System.out.print(ch++ + " ");
                if(ch=='f')
                    dig=true;
            }
        }
        System.out.println();
    }
		
	}
}